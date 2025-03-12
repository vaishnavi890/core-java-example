package com.vaishnavi.practices.multithreading.lifecycle;

public class Employee extends Thread{
    private String employeeName;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
        setName(employeeName);  // Setting the thread name
        setPriority(Thread.NORM_PRIORITY);  // Setting the default priority
    }

    // Lifecycle methods
    public void hireEmployee() {
        System.out.println(getName() + " has been hired.");
    }

    public void startWorking() {
        System.out.println(getName() + " is working.");
    }

    public void takeBreak() {
        System.out.println(getName() + " is taking a break.");
    }

    public void terminateEmployee() {
        System.out.println(getName() + " has been terminated.");
    }

    @Override
    public void run() {
        try {
            hireEmployee();
            Thread.sleep(500);  // Simulate hiring process

            startWorking();
            Thread.sleep(1000);  // Simulate working period

            // Yielding the CPU to give other threads a chance
            System.out.println(getName() + " is yielding for other employees.");
            Thread.yield();

            takeBreak();
            Thread.sleep(500);  // Simulate break time

            startWorking();
            Thread.sleep(1000);  // Resume work

            // Check if the thread is still active
            if (isAlive()) {
                System.out.println(getName() + " is still active. Current state: " + getState());
            }

            terminateEmployee();
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // Creating employee threads
        Employee emp1 = new Employee("Supriya");
        Employee emp2 = new Employee("Siya");
        Employee emp3 = new Employee("Priya");

        // Setting priorities
        emp1.setPriority(Thread.MIN_PRIORITY);
        emp2.setPriority(Thread.NORM_PRIORITY);
        emp3.setPriority(Thread.MAX_PRIORITY);

        // Starting the threads
        emp1.start();
        emp2.start();
        emp3.start();

        // Joining threads to ensure completion before main exits
        emp1.join();
        emp2.join();
        emp3.join();

        System.out.println("All employees have completed their tasks.");
    }
}
