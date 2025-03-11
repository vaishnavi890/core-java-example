package com.vaishnavi.practices.multithreading.runnable;

public class ThreadImplementationDemo {
    public static void main(String[] args) {
        System.out.println("Demonstration of threads by implementing runnable starts here: ");
        int n = 10; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread thread = new Thread(new MyThread());
            thread.start();
        }
    }
}
