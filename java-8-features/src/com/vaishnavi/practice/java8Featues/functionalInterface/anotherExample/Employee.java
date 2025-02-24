package com.vaishnavi.practice.java8Featues.functionalInterface.anotherExample;

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

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    // Setter
    public void setSalary(double salary) { this.salary = salary; }

    // toString() method for printing
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}
