package com.vaishnavi.practice.java8Featues.forEachMethod;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StudentExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(101, "Raj", 20, 85.5),
                new Student(102, "Chakuli", 22, 76.0),
                new Student(103, "Riya", 19, 90.2),
                new Student(104, "Trisha", 21, 60.8),
                new Student(105, "Vaishu", 23, 95.0)
        );

        // 1. Using forEach with Lambda Expression
        System.out.println("All Students:");
        students.forEach(student -> System.out.println(student));

        // 2. Using forEach with Method Reference
        System.out.println("\nUsing Method Reference:");
        students.forEach(System.out::println);

        // 3. Using forEach with a Custom Consumer
        Consumer<Student> printStudent = student ->
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName() +
                        ", Age: " + student.getAge() + ", Marks: " + student.getMarks());
        System.out.println("\nUsing Custom Consumer:");
        students.forEach(printStudent);
    }
}
