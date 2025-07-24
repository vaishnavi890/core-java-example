package com.vaishnavi.practice.dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Student {
    int studentId;
    String name;
    LocalDateTime admissionDateTime;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.admissionDateTime = LocalDateTime.now(); // Set current date and time
    }

    public void displayInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = admissionDateTime.format(formatter);

        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Admission Date & Time: " + formattedDateTime);
    }
}

