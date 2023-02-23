package com.homework.servlet.service;

public class LoginService {
    private static LoginService instance;
    private final UserService userService = UserService.getInstance();

    private LoginService() {

    }

    public static LoginService getInstance() {
        if (instance == null) {
            instance = new LoginService();
        }
        return instance;
    }

    public boolean checkCredentials (String login, String password) {
        if (userService.userArtem.getLogin().equals(login)
        && userService.userArtem.getPassword().equals(password)) {
            return true;
        }

        return false;
    }
}
