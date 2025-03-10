package com.vaishnavi.practices.multithreading.thread;

public class Student extends Thread {
    private String studentName;
    private int assignmentCount;

    public Student(String studentName, int assignmentCount) {
        this.studentName = studentName;
        this.assignmentCount = assignmentCount;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= assignmentCount; i++) {
                System.out.println(studentName + " is submitting assignment " + i);
                // Simulate time taken to complete an assignment
                Thread.sleep(1000);
            }
            System.out.println(studentName + " has submitted all assignments.");
        } catch (InterruptedException e) {
            System.out.println(studentName + " was interrupted during submission.");
        }
    }
}
