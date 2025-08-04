package com.vaishnavi.practice.staticClass.staticInner;

public class College {
    static String collegeName = "National Institute of Technology";

    // Static Inner Class
    static class Student {
        private int rollNo;
        private String name;

        public Student(int rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }

        public void displayInfo() {
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Roll No: " + rollNo);
            System.out.println("Student Name: " + name);
        }
    }

    public static void main(String[] args) {
        // Create an object of static inner class
        College.Student student1 = new College.Student(101, "Vaishnavi");
        student1.displayInfo();
    }
}
