package com.vaishnavi.practices.multithreading.thread;

public class ThreadImplementationDemo {
    public static void main(String[] args) {
        System.out.println("Demonstration of threads by extending Thread starts here: ");
        int noOfThreads = 15; // Number of threads
        for (int i = 0; i < noOfThreads; i++) {
            MyThread thread = new MyThread();
            thread.start();
        }
    }
}
