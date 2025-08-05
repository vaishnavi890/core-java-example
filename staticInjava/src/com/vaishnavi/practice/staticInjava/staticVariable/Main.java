package com.vaishnavi.practice.staticInjava.staticVariable;

class Student {
    static String schoolName = "ABC scl";
    String studentName;

    Student(String studentName) {
        this.studentName = studentName;
    }

    void printInfo() {
        System.out.println(studentName + " studies at " + schoolName);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Student student1 = new Student("Bob");

        student.printInfo();
        student1.printInfo();

        Student.schoolName = "XZY school";

        student.printInfo();
        student1.printInfo();
    }
}

