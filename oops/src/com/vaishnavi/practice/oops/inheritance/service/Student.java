package com.vaishnavi.practice.oops.inheritance.service;

public class Student extends Person{
    String studentId;
    String course;

    // Constructor for Student
    public Student(String name, int age, String studentId, String course) {
        super(name, age); // Call to the parent class constructor
        this.studentId = studentId;
        this.course = course;
    }

    // Method to display student-specific details
    public void displayStudentDetails() {
        displayDetails(); // Call parent class method
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }

}

