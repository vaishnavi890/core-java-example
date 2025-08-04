package com.vaishnavi.practice.staticClass.staticInner;

public class OuterClassExample {
    // Static variable
    static String companyName = "Tech Solutions";

    // Static Inner Class
    static class StaticInnerClass {
        void display() {
            System.out.println("Welcome to " + companyName);
        }
    }

    public static void main(String[] args) {
        // Create instance of static inner class
        OuterClassExample.StaticInnerClass inner = new OuterClassExample.StaticInnerClass();
        inner.display();
    }
}
