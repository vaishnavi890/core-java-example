package com.vaishnavi.practices.multithreading.threadMethod;

public class ThreadStateWatcher {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread is running...");
                Thread.sleep(2000); // Simulate some work
                System.out.println("Thread completed!");
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        });

        // Watch the state of the thread
        System.out.println("Thread State before start: " + thread.getState());
        thread.start();

        while (thread.isAlive()) {
            System.out.println("Thread State during execution: " + thread.getState());
            try {
                Thread.sleep(500); // Check state every 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread State after completion: " + thread.getState());
    }
}
