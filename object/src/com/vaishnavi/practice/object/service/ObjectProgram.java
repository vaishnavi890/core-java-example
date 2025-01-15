package com.vaishnavi.practice.object.service;

public class ObjectProgram {
        public static void main(String[] args) {
            // Create objects of the Person class
            Person person1 = new Person("Komal", 25);
            Person person2 = new Person("Radha", 24);

            // Display details of each person
            person1.displayDetails();
            System.out.println(); // Line break
            person2.displayDetails();
        }
    }

