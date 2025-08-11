package com.vaishnavi.accessSpecifier.defaultSpecifier;

class Student { // default access (no modifier)
    String name; // default access
    int age;     // default access

    // default method
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student(); // Works because it's the same package
        s.name = "Vaishnavi";
        s.age = 22;
        s.displayInfo();
    }
}

