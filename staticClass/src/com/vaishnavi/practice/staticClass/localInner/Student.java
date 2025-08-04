package com.vaishnavi.practice.staticClass.localInner;

public class Student {
    void showResult(String name, int marks) {

        // Local Inner Class inside method
        class Result {
            void display() {
                System.out.println("Student Name: " + name);
                System.out.println("Marks: " + marks);
                if (marks >= 40) {
                    System.out.println("Status: Pass");
                } else {
                    System.out.println("Status: Fail");
                }
            }
        }

        // Create object of local inner class
        Result result = new Result();
        result.display();
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.showResult("Vaishnavi", 85);
    }
}
