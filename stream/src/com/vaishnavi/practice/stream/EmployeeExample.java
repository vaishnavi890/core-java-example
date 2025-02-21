package com.vaishnavi.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class EmployeeExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Komal", "HR", 60000),
                new Employee(102, "Raj", "IT", 75000),
                new Employee(103, "Saurabh", "Finance", 80000),
                new Employee(104, "Rudra", "IT", 90000),
                new Employee(105, "Shreyash", "HR", 65000),
                new Employee(106, "Supriya", "Finance", 72000)
        );

        // 1. Filter employees in the IT department
        List<Employee> itEmployees = employees.stream()
                .filter(emp -> "IT".equals(emp.getDepartment()))
                .collect(Collectors.toList());
        System.out.println("IT Employees: " + itEmployees);

        // 2. Get the names of all employees
        List<String> employeeNames = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println("Employee Names: " + employeeNames);

        // 3. Find the employee with the highest salary
        Optional<Employee> highestPaidEmployee = employees.stream()
                .max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println("Highest Paid Employee: " + highestPaidEmployee.orElse(null));

        // 4. Sort employees by salary
        List<Employee> sortedBySalary = employees.stream()
                .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .collect(Collectors.toList());
        System.out.println("Employees sorted by salary: " + sortedBySalary);

        // 5. Count employees in the Finance department
        long financeCount = employees.stream()
                .filter(emp -> "Finance".equals(emp.getDepartment()))
                .count();
        System.out.println("Number of Finance Employees: " + financeCount);

        // 6. Increase salary by 10% for all employees
        List<Employee> salaryIncrementedEmployees = employees.stream()
                .map(emp -> new Employee(emp.getId(), emp.getName(), emp.getDepartment(), emp.getSalary() * 1.1))
                .collect(Collectors.toList());
        System.out.println("Employees with 10% Salary Increment: " + salaryIncrementedEmployees);

        // 7. Use forEach to print all employees
        System.out.println("All Employees:");
        employees.stream().forEach(System.out::println);
    }
}
