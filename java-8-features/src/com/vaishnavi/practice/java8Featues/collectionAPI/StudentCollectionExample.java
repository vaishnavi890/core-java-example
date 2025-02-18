package com.vaishnavi.practice.java8Featues.collectionAPI;

import java.util.List;
import java.util.Set;

public class StudentCollectionExample {
        public static void main(String[] args) {
            // Getting an immutable list of students
            List<Student> students = Student.getStudentList();
            // Getting an immutable set of student names
            Set<String> studentNames = Student.getStudentNames();

            // Display students using Stream API
            System.out.println("\n Student List:");
            students.forEach(Student::display);

            // Display student names
            System.out.println("\n Student Names:");
            studentNames.forEach(name -> System.out.println("name " + name));

            // Uncommenting below lines will cause UnsupportedOperationException
            // students.add(new Student(104, "David", 23)); // ERROR
            // studentNames.add("David"); // ERROR
        }
    }
