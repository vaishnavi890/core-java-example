package com.vaishnavi.practice.exceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            String input1 = sc.nextLine();
            int num1 = Integer.parseInt(input1); // May throw NumberFormatException

            System.out.print("Enter second number: ");
            String input2 = sc.nextLine();
            int num2 = Integer.parseInt(input2); // May throw NumberFormatException

            int result = num1 / num2; // May throw ArithmeticException
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter only numeric values!");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using the program.");
            sc.close();
        }

        System.out.println("Program finished.");
    }
}
