package com.vaishnavi.practice.java8Featues.forEachMethod;

import com.vaishnavi.practice.java8Featues.forEachMethod.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class ForEachEmployeeExample {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Saurabh", 50000));
        employees.add(new Employee(102, "Radha", 60000));
        employees.add(new Employee(103, "Rudra", 55000));

        // Using forEach with a lambda expression
        employees.forEach(emp -> System.out.println(emp));

        // Using forEach with a method reference
        employees.forEach(System.out::println);
    }
}
