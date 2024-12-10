package com.vaishnavi.ecommerce.service;

import com.vaishnavi.ecommerce.model.User;
import java.util.Scanner;

public class UserService {
    public User acceptUserData() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the user id ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("enter the user first name ");
        String firstName = sc.nextLine();
        System.out.println("enter the user last name ");
        String lastName = sc.nextLine();

        User u = new User();
        u.id = id;
        u.firstName = firstName;
        u.lastName = lastName;

        return u;

    }
}

