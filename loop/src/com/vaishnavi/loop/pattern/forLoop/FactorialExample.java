package com.vaishnavi.loop.pattern.forLoop;

public class FactorialExample {
    public static void main(String[] args) {
        int number = 5;      // Number to calculate factorial
        int factorial = 1;   // Store result

        // Calculate factorial using for loop
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
