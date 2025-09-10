package com.vaishnavi.practice.collections.set.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Student {
    private int id;
    private String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding hashCode() and equals() to avoid duplicates
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + "'}";
    }
}

public class HashSetCustomObjectExample {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        // 1. Adding elements
        students.add(new Student(101, "Vaishnavi"));
        students.add(new Student(102, "Rohan"));
        students.add(new Student(103, "Priya"));
        students.add(new Student(101, "Vaishnavi")); // Duplicate, ignored

        // 2. Displaying elements
        System.out.println("Students: " + students);

        // 3. Size of the HashSet
        System.out.println("Total Students: " + students.size());

        // 4. Check if a specific student exists
        System.out.println("Contains Rohan? " + students.contains(new Student(102, "Rohan")));

        // 5. Remove an element
        students.remove(new Student(103, "Priya"));
        System.out.println("After removing Priya: " + students);

        // 6. Iterate using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 7. Clear the HashSet
        students.clear();
        System.out.println("\nAfter clearing: " + students);

        // 8. Check if empty
        System.out.println("Is HashSet empty? " + students.isEmpty());
    }
}


