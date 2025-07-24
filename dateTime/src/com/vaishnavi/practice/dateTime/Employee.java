package com.vaishnavi.practice.dateTime;

class Employee {
    int empId;
    String name;
    double salary;

    // Constructor
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Display employee information
    public void displayInfo() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}


