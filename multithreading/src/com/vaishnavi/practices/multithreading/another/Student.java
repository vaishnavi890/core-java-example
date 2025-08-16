package com.vaishnavi.practices.multithreading.another;

public class Student extends Thread {
    private String studentName;

    public Student(String name) {
        this.studentName = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(studentName + " started studying...");

            for (int i = 1; i <= 3; i++) {
                System.out.println(studentName + " is studying chapter " + i);
                Thread.sleep(1000); // simulate time taken for studying
            }

            System.out.println(studentName + " has submitted the assignment.");
        } catch (InterruptedException e) {
            System.out.println(studentName + " got interrupted!");
        }
    }
}
