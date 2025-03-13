package com.vaishnavi.practices.multithreading.threadMethod;

public class Student extends Thread{
    private String name;
    private String subject;

    public Student(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void run() {
        System.out.println(name + " has started attending the " + subject + " class.");

        // Yielding the current thread to let others execute
        Thread.yield();

        try {
            // Simulating the time taken for the class
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted during the class.");
        }

        System.out.println(name + " has finished attending the " + subject + " class.");
    }

    public static void main(String[] args) {
        // Creating Student Threads
        Student student1 = new Student("Supriya", "Math");
        Student student2 = new Student("Riya", "Science");
        Student student3 = new Student("Charlie", "English");
        Student student4 = new Student("David", "History");

        // Starting Threads
        student1.start();
        student2.start();
        student3.start();
        student4.start();
    }
}

