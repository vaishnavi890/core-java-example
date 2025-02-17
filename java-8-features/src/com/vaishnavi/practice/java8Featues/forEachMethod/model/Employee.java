package com.vaishnavi.practice.java8Featues.forEachMethod.model;

public class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Employee { ID: " + id + ", Name: " + name + ", Salary: $" + salary + " }";
    }
}
