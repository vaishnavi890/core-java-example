package com.vaishnavi.practices.multithreading.lock;

public class StudentObjectLevelLockExample extends Thread{
    private String studentName;

    public StudentObjectLevelLockExample(String studentName) {
        this.studentName = studentName;
    }

    // Object-level synchronized method
    public synchronized void attendClass() {
        System.out.println(studentName + " is attending the class...");
        try {
            Thread.sleep(2000);  // Simulate class time
        } catch (InterruptedException e) {
            System.out.println("Class interrupted for " + studentName);
        }
        System.out.println(studentName + " has completed the class.");
    }

    @Override
    public void run() {
        attendClass();
    }

    public static void main(String[] args) {
        // Creating multiple student objects
        StudentObjectLevelLockExample student1 = new StudentObjectLevelLockExample("Sanika");
        StudentObjectLevelLockExample student2 = new StudentObjectLevelLockExample("Saurabh");
        StudentObjectLevelLockExample student3 = new StudentObjectLevelLockExample("Shivam");

        // Starting the threads
        student1.start();
        student2.start();
        student3.start();
    }
}
