package com.vaishnavi.practice.strings.toString;

public class ToStringExample {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Vaishnavi", "Java Programming");
        System.out.println(s1); // Automatically calls toString()
    }
}
