package com.vaishnavi.practice.oops.abstraction.interfaceExample;

public class PartTimeEmployee implements Employee{
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void work() {
        System.out.println("Part-time employee is working flexible hours.");
    }

    @Override
    public double getSalary() {
        return hourlyRate * hoursWorked;
    }
}
