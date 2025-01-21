package com.vaishnavi.practice.exceptionHandling;

public class ExceptionTryCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int number = 10;
            int division = 0;
            int result = number / division; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Error: Division by zero is not allowed.");
        }

        System.out.println("Program continues after exception handling.");
    }
}

