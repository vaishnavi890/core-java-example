package com.vaishnavi.practice.constuctor.parameterizedConstructor;

public class Student {
        String name;
        int age;

        // Parameterized constructor
        Student(String n, int a) {
            name = n;
            age = a;
        }

        // Method to display student info
        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        public static void main(String[] args) {
            // Creating objects using parameterized constructor
            Student s1 = new Student("Vaishnavi", 22);
            Student s2 = new Student("Aniket", 21);

            // Displaying information
            s1.display();
            s2.display();
        }

}
