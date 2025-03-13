package com.vaishnavi.practices.multithreading.runnable;

public class Employee implements Runnable{
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            System.out.println("Employee " + name + " (ID: " + id + ") is marking attendance.");
            // Simulating delay in marking attendance
            Thread.sleep(1000);
            System.out.println("Employee " + name + " (ID: " + id + ") has successfully marked attendance.");
        } catch (InterruptedException e) {
            System.out.println("Attendance marking interrupted for employee " + name);
        }
    }
    public static void main(String[] args) {
        // Creating employee objects implementing Runnable
        Runnable employee1 = new Employee("Alice", 101);
        Runnable employee2 = new Employee("Bob", 102);
        Runnable employee3 = new Employee("Charlie", 103);
        Runnable employee4 = new Employee("David", 104);

        // Creating and starting threads for each employee
        Thread thread1 = new Thread(employee1);
        Thread thread2 = new Thread(employee2);
        Thread thread3 = new Thread(employee3);
        Thread thread4 = new Thread(employee4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
