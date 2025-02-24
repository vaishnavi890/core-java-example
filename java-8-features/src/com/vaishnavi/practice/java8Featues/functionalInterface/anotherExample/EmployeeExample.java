package com.vaishnavi.practice.java8Featues.functionalInterface.anotherExample;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", 50000));
        employees.add(new Employee(2, "Bob", 60000));
        employees.add(new Employee(3, "Charlie", 70000));
        employees.add(new Employee(4, "David", 80000));

        // Using Functional Interface to increase salary by 10%
        EmployeeProcessor salaryIncrement = emp -> {
            emp.setSalary(emp.getSalary() * 1.10);
            return emp;
        };

        // Stream API with map() and collect()
        List<Employee> updatedEmployees = employees.stream()
                .map(salaryIncrement::process) // Applying functional interface method
                .collect(Collectors.toList());

        // Printing updated employee details
        updatedEmployees.forEach(System.out::println);

        // Using Stream API to create a Map of Employee ID -> Employee Name
        Map<Integer, String> employeeMap = employees.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getName));

        // Printing the Employee Map
        System.out.println("Employee Map: " + employeeMap);
    }
}
