package com.vaishnavi.practice.java8Featues.collectionAPI;

import java.util.List;
import java.util.Set;


public class Student {
        private final int id;
        private final String name;
        private final int age;

        // Constructor
        public Student(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        // Getters
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        // Display student details
        public void display() {
            System.out.println("🎓 ID: " + id + " | Name: " + name + " | Age: " + age);
        }

        // Factory method to create an immutable list of students
        public static List<Student> getStudentList() {
            return List.of(
                    new Student(101, "Komal", 20),
                    new Student(102, "Radha", 22),
                    new Student(103, "Saurabh", 21)
            );
        }

        // Factory method to create an immutable set of student names
        public static Set<String> getStudentNames() {
            return Set.of(
                    "Komal",
                    "Radha",
                    "Saurabh"
            );
        }
    }
