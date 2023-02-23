package com.homework.servlet.filter;

import com.homework.servlet.model.entity.User;
import com.homework.servlet.service.UserService;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter (urlPatterns = "/*")
public class AuthFilter implements Filter {
    private final UserService userService = UserService.getInstance();

    @Override
    public void doFilter(final ServletRequest servletRequest, final ServletResponse servletResponse,
                         final FilterChain filterChain) throws IOException, ServletException {

        var httpServletRequest = (HttpServletRequest) servletRequest;
        var url = httpServletRequest.getRequestURL().toString();
        var session = httpServletRequest.getSession();

        User user = (User) session.getAttribute("user");

        if (user != null || url.contains("/login")) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            servletRequest.getRequestDispatcher("/login").forward(servletRequest, servletResponse);
        }
    }
}
