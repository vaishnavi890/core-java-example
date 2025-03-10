package com.vaishnavi.practices.multithreading.thread;

public class StudentExample {
    public static void main(String[] args) {
        // Creating student threads
        Student student1 = new Student("Supriya", 3);
        Student student2 = new Student("Radha", 4);
        Student student3 = new Student("Siya", 2);

        // Starting the threads
        student1.start();
        student2.start();
        student3.start();
    }
}
