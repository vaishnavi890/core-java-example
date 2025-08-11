package com.vaishnavi.accessSpecifier.defaultSpecifier;

class Student { // default access (no modifier)
    String name; // default access
    int age;     // default access

    // default method
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


