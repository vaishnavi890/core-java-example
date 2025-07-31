package com.vaishnavi.practice.garbageCollector.gc;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Student ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Vaishnavi");
        Student s2 = new Student(102, "Rahul");

        s1.showDetails();
        s2.showDetails();

        // Remove references — make them eligible for GC
        s1 = null;
        s2 = null;

        // Suggest garbage collection
        System.gc();

        System.out.println("Main ends. Student objects are now eligible for GC.");
    }
}

