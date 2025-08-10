package com.vaishnavi.practice.number.logicalOperator;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Logical AND (&&)
        System.out.println("a && b = " + (a && b)); // false

        // Logical OR (||)
        System.out.println("a || b = " + (a || b)); // true

        // Logical NOT (!)
        System.out.println("!a = " + (!a)); // false

        // Example with numbers
        int x = 10, y = 20;

        if (x > 5 && y > 15) {
            System.out.println("Both conditions are true.");
        }

        if (x < 5 || y > 15) {
            System.out.println("At least one condition is true.");
        }
    }
}


