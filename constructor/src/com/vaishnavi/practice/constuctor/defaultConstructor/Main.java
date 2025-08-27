package com.vaishnavi.practice.constuctor.defaultConstructor;

class Employee {
    String name;
    int salary;
}

public class Main {
    public static void main(String[] args) {
        // Java automatically creates a default constructor here
        Employee emp = new Employee();
        System.out.println(emp.name);   // null (default value)
        System.out.println(emp.salary); // 0   (default value)
    }
}


