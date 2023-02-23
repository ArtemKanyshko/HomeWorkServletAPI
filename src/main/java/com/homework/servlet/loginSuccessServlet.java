package com.homework.servlet;

import com.homework.servlet.service.LoginService;
import com.homework.servlet.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet (urlPatterns = "/loginSuccess")
public class loginSuccessServlet extends HttpServlet {
    private final LoginService loginService = LoginService.getInstance();
    private final UserService userService = UserService.getInstance();

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {

        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if (loginService.checkCredentials(login, password)) {
            req.getRequestDispatcher("/WEB-INF/jsp/loginSuccess.jsp").forward(req, resp);

            HttpSession session = req.getSession();
            session.setAttribute("user", userService.getUser());
        } else {
            req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req, resp);
        }
    }
}
