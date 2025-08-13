package com.vaishnavi.accessSpecifier.publicSpecifier;

public class Employee {
    public String name;      // public: accessible everywhere
    public int employeeId;   // public: accessible everywhere

    public void displayInfo() {  // public method
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}


