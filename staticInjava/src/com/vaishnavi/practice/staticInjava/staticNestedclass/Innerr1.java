package com.vaishnavi.practice.staticInjava.staticNestedclass;

//Static Nested Class
//You can create a class inside another class and make it static. It does not need an outer class instance to be created.
class Outer {
    static class Inner {
        void display() {
            System.out.println("Inside static nested class");
        }
    }
}

public class Innerr1 {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.display(); // Inside static nested class
    }
}

