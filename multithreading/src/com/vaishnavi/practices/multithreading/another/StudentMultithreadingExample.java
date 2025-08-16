package com.vaishnavi.practices.multithreading.another;

public class StudentMultithreadingExample {
    public static void main(String[] args) {
        // Creating multiple student threads
        Student s1 = new Student("Vaishnavi");
        Student s2 = new Student("Aarav");
        Student s3 = new Student("Priya");

        // Starting threads
        s1.start();
        s2.start();
        s3.start();
    }
}
