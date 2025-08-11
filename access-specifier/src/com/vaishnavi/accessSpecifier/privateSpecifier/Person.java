package com.vaishnavi.accessSpecifier.privateSpecifier;

public class Person {
    private String name; // private variable
    private int age;     // private variable

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter
    public String getName() {
        return name;
    }

    // Public setter
    public void setName(String name) {
        this.name = name;
    }

    // Public method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


