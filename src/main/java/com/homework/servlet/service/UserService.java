package com.homework.servlet.service;

import com.homework.servlet.model.entity.User;

public class UserService {

    private static UserService instance;


    private UserService() {

    }
    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    public User getUser() {
        return new User("Artem", "qwerty", "Artem", 28, "male");
    }

    public String userGetName() {
        return getUser().getName();
    }

    public String userInfo() {
        return getUser().getName() + " ,"
                + getUser().getAge() + " ,"
                + getUser().getSex();
    }


}
