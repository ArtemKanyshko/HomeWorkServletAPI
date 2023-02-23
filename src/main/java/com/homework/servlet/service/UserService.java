package com.homework.servlet.service;

import com.homework.servlet.model.entity.User;

public class UserService {

    private static UserService instance;

    User userArtem = new User("Artem", "qwerty", "Artem", 28, "male");

    private UserService() {

    }
    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    public User getUser() {
        return userArtem;
    }

    public String userGetName() {
        return userArtem.getName();
    }

    public String userInfo() {
        return userArtem.getName() + " ,"
                + userArtem.getAge() + " ,"
                + userArtem.getSex();
    }


}
