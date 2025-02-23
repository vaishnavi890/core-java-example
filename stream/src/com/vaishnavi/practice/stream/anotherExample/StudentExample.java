package com.vaishnavi.practice.stream.anotherExample;

import java.util.*;

public class StudentExample {
    public static void main(String[] args) {
        // List of Students (ArrayList)
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Supriya", 22, 85.5));
        students.add(new Student(102, "Raj", 20, 76.0));
        students.add(new Student(103, "Riya", 23, 90.2));
        students.add(new Student(104, "Priyanka", 21, 65.8));
        
        // Using Stream API to filter students with marks > 80
        System.out.println("\nStudents with marks above 80:");
        students.stream()
                .filter(s -> s.getMarks() > 80)
                .forEach(s -> System.out.println(s.getName() + " - " + s.getMarks()));

        // Using Lambda Expression to Sort Students by Marks
        students.sort((s1, s2) -> Double.compare(s2.getMarks(), s1.getMarks()));

        // Displaying sorted students
        System.out.println("\nStudents sorted by marks:");
        students.forEach(s -> System.out.println(s.getName() + " - " + s.getMarks()));

        // Using Map to store Student ID and Name
        Map<Integer, String> studentMap = new HashMap<>();
        students.forEach(s -> studentMap.put(s.getId(), s.getName()));

        // Iterating over Map using Iterator
        System.out.println("\nStudent ID and Name:");
        Iterator<Map.Entry<Integer, String>> iterator = studentMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("ID: " + entry.getKey() + " - Name: " + entry.getValue());
        }
    }
}
