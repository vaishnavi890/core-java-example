package com.vaishnavi.practice.lambda.lambdaExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StudentExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(101, "Komal", 20, 85.5),
                new Student(102, "Raj", 22, 76.0),
                new Student(103, "Saurabh", 19, 90.2),
                new Student(104, "Shreyash", 21, 60.8),
                new Student(105, "Rudra", 23, 95.0)
        );

        // 1. Using Lambda to filter students with marks above 80
        Predicate<Student> highScorer = student -> student.getMarks() > 80;
        List<Student> topStudents = students.stream()
                .filter(highScorer)
                .collect(Collectors.toList());
        System.out.println("Students with marks above 80: " + topStudents);

        // 2. Using Lambda to print all student names
        Consumer<Student> printName = student -> System.out.println(student.getName());
        System.out.println("Student Names:");
        students.forEach(printName);

        // 3. Using Lambda to get list of student names
        Function<Student, String> getName = Student::getName;
        List<String> studentNames = students.stream()
                .map(getName)
                .collect(Collectors.toList());
        System.out.println("List of Student Names: " + studentNames);

        // 4. Using Lambda to sort students by marks
        Comparator<Student> sortByMarks = (s1, s2) -> Double.compare(s1.getMarks(), s2.getMarks());
        List<Student> sortedStudents = students.stream()
                .sorted(sortByMarks)
                .collect(Collectors.toList());
        System.out.println("Students sorted by marks: " + sortedStudents);

        // 5. Using Lambda to calculate the average marks
        double averageMarks = students.stream()
                .mapToDouble(Student::getMarks)
                .average()
                .orElse(0.0);
        System.out.println("Average Marks: " + averageMarks);

        // 6. Using Lambda to increment marks by 5% for all students
        List<Student> updatedStudents = students.stream()
                .map(student -> new Student(student.getId(), student.getName(), student.getAge(), student.getMarks() * 1.05))
                .collect(Collectors.toList());
        System.out.println("Students with 5% marks increment: " + updatedStudents);
    }
}

