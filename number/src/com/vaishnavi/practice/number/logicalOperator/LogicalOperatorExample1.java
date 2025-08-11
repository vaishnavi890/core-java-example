package com.vaishnavi.practice.number.logicalOperator;

public class LogicalOperatorExample1 {
        public static void main(String[] args) {
            int marks = 85;
            int attendance = 90;

            // Logical AND (&&) - true only if both conditions are true
            if (marks >= 75 && attendance >= 80) {
                System.out.println("Eligible for scholarship (AND condition passed).");
            } else {
                System.out.println("Not eligible for scholarship (AND condition failed).");
            }

            // Logical OR (||) - true if at least one condition is true
            if (marks >= 90 || attendance >= 95) {
                System.out.println("Eligible for extra credit (OR condition passed).");
            } else {
                System.out.println("Not eligible for extra credit (OR condition failed).");
            }

            // Logical NOT (!) - reverses the boolean result
            boolean hasBacklog = false;
            if (!hasBacklog) {
                System.out.println("You have no backlogs (NOT condition passed).");
            } else {
                System.out.println("You have backlogs (NOT condition failed).");
            }
        }
    }


