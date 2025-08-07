package com.vaishnavi.practice.staticInjava.staticVariable;

public class College {

    // Static variable - shared by all Student instances
    static String collegeName = "ABC Engineering College";

    // Instance variables
    int studentId;
    String studentName;

    // Constructor
    public College(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // Method to display student info
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + collegeName); // shared static variable
    }

    // Main method
    public static void main(String[] args) {
        // Create students
        College s1 = new College(101, "Vaishnavi");
        College s2 = new College(102, "Aarav");

        // Display info
        s1.displayInfo();
        System.out.println("---------------------");
        s2.displayInfo();
    }
}

