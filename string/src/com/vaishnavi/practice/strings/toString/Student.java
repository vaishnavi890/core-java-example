package com.vaishnavi.practice.strings.toString;

public class Student {
    int id;
    String name;
    String course;

    // Constructor
    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    // Overriding toString()
    public String toString() {
        return "Student ID: " + id + ", Name: " + name + ", Course: " + course;
    }
}
