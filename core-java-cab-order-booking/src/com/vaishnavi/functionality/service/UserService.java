package com.vaishnavi.functionality.service;

import com.vaishnavi.functionality.model.Users;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private  List<Object> usersList = new ArrayList<>();

    public void registerUser(Users user) {
        usersList.add(user);
        System.out.println("User registered successfully: " + user);
    }

    public void viewUsers() {
        if (usersList.isEmpty()) {
            System.out.println("No users found.");
        } else {
            System.out.println("Registered Users:");
            for (Object user : usersList) {
                System.out.println(user);
            }
        }
    }
}

