package com.vaishnavi.practices.multithreading.another;

public class Employee extends Thread {
    private String employeeName;

    public Employee(String name) {
        this.employeeName = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(employeeName + " started working...");

            for (int i = 1; i <= 3; i++) {
                System.out.println(employeeName + " is working on Task " + i);
                Thread.sleep(1000); // Simulating time taken for work
            }

            System.out.println(employeeName + " has submitted the report.");
        } catch (InterruptedException e) {
            System.out.println(employeeName + " was interrupted!");
        }
    }
}
