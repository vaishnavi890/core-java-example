package com.vaishnavi.scheme.service;
import com.vaishnavi.scheme.model.Person;
import java.util.Scanner;

public class GovtSchemeDemoApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first name:");
        String firstName = sc.nextLine();

        System.out.println("Please enter last name:");
        String lastName = sc.nextLine();

        System.out.println("please enter your age!");
        int age = sc.nextInt();

        Person p = new Person();
        p.firstName = firstName;
        p.lastName = lastName;
        p.age = age;

        System.out.println("Person details..." + p);
    }
}

