package com.vaishnavi.practice.staticInjava.staticBlock;

public class StaticBlockExample {

    static int number;

    // Static block
    static {
        System.out.println("Static block is executed.");
        number = 10; // initializing static variable
    }

    public static void main(String[] args) {
        System.out.println("Main method is executed.");
        System.out.println("Value of number: " + number);
    }
}


