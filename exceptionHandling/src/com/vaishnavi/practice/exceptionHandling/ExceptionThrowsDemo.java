package com.vaishnavi.practice.exceptionHandling;

import java.util.Scanner;

public class ExceptionThrowsDemo {
    public static void division() throws NumberFormatException {
        System.out.println("Please enter 2 values:");
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        int no1 = Integer.parseInt(firstInput);
        int no2 = Integer.parseInt(secondInput);

        System.out.println("Division: " + no1/ no2);
    }

    public static void process() {
        try {
            division();
        } catch (NumberFormatException ex) {
            System.err.println();
        }
    }

    public static void main(String[] args) {
        process();
    }
}
