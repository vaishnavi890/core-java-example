package com.vaishnavi.practice.exceptionHandling;

public class ExceptionHandlingExample3 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0; // This will cause an exception
            int result = divide(num1, num2);
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        }
        finally {
            System.out.println("Execution completed.");
        }
    }

    // Method with throws declaration
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero not allowed.");
        }
        return a / b;
    }
}
