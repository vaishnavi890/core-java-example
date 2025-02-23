package com.vaishnavi.practice.java8Featues.functionalInterface.anotherExample;

public class StudentExample {
    public static void main(String[] args) {
        // Using Lambda Expression
        Student studentInfo = (name, age, marks) -> {
            System.out.println("Student Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Marks: " + marks);
        };

        // Calling the method
        studentInfo.displayStudentDetails("Supriya", 23, 85.5);
    }
}
