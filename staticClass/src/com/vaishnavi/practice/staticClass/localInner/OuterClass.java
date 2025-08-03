package com.vaishnavi.practice.staticClass.localInner;

public class OuterClass {

    void myMethod() {
        class LocalInner {
            void display() {
                System.out.println("Inside Local Inner Class");

                // Create object of static nested class
                StaticHelper.displayMessage();
            }
        }

        LocalInner local = new LocalInner();
        local.display();
    }

    // Static nested class outside method
    static class StaticHelper {
        static void displayMessage() {
            System.out.println("Static method from static nested class");
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.myMethod();
    }
}


