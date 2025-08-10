package com.vaishnavi.practice.number.logicalOperator;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        // Logical AND (&&) - true if both are true
        System.out.println("x && y = " + (x && y)); // false

        // Logical OR (||) - true if at least one is true
        System.out.println("x || y = " + (x || y)); // true

        // Logical NOT (!) - reverses the boolean value
        System.out.println("!x = " + (!x)); // false

        // Example with conditions
        int a = 10, b = 20;
        System.out.println("\nChecking conditions:");

        if (a > 5 && b > 15) {
            System.out.println("Both conditions are true.");
        }

        if (a > 15 || b > 15) {
            System.out.println("At least one condition is true.");
        }
    }
}

