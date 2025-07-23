package com.vaishnavi.practice.java17features;

public class StudentExample {
    public static void main(String[] args) {

        // Array of Students
        Student[] students = {
                new Student("Vaishnavi", 85),
                new Student("Amit", 92),
                new Student("Rahul", 76)
        };

        // Print all student data
        for (Student s : students) {
            System.out.println(s.name() + " got " + s.marks() + " marks.");
        }
    }
}

