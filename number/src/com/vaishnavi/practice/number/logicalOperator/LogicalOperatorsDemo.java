package com.vaishnavi.practice.number.logicalOperator;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Logical AND (&&) - true only if both are true
        System.out.println("a && b = " + (a && b)); // false

        // Logical OR (||) - true if at least one is true
        System.out.println("a || b = " + (a || b)); // true

        // Logical NOT (!) - reverses the value
        System.out.println("!a = " + (!a)); // false

        // Example with numbers
        int x = 10, y = 20;

        if (x > 5 && y > 15) {
            System.out.println("Both conditions are true.");
        }

        if (x < 5 || y > 15) {
            System.out.println("At least one condition is true.");
        }

        if (!(x > 15)) {
            System.out.println("Condition is NOT true.");
        }
    }
}


