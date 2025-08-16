package com.vaishnavi.practices.multithreading.another;

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();  // Create thread object
        MyThread t2 = new MyThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start(); // Start first thread
        t2.start(); // Start second thread
    }
}
