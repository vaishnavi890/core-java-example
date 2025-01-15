package com.vaishnavi.practice.object.service;

public class Person {
    // Properties of the class
    String name;
    int age;

    // Constructor to initialize the object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


