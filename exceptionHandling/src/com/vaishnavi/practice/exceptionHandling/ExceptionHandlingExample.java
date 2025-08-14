package com.vaishnavi.practice.exceptionHandling;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0; // This will cause an exception
            int result = divide(a, b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution completed. (finally block always runs)");
        }

        System.out.println("Program continues...");
    }

    // Method with throws clause
    public static int divide(int num1, int num2) throws ArithmeticException {
        return num1 / num2; // May throw ArithmeticException
    }
}
