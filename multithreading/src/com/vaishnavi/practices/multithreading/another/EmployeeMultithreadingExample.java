package com.vaishnavi.practices.multithreading.another;

public class EmployeeMultithreadingExample {
    public static void main(String[] args) {
        // Creating multiple employees (threads)
        Employee e1 = new Employee("Employee-1: Vaishnavi");
        Employee e2 = new Employee("Employee-2: Aarav");
        Employee e3 = new Employee("Employee-3: Priya");

        // Starting all employee threads
        e1.start();
        e2.start();
        e3.start();
    }
}
