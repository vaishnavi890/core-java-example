package com.vaishnavi.practices.multithreading.thread;

public class MyThread extends Thread{
    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught: " + e.getMessage());
        }
    }
}
