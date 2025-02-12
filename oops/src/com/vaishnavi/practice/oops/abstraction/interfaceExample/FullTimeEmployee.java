package com.vaishnavi.practice.oops.abstraction.interfaceExample;

public class FullTimeEmployee implements Employee{
    private  double salary;

    public FullTimeEmployee(double salary) {
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("Full-time employee is working 9 AM to 5 PM.");
    }

    @Override
    public double getSalary() {
        return salary;
    }
}

