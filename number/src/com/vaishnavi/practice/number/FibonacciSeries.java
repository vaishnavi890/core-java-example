package com.vaishnavi.practice.number;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many Fibonacci numbers to print: ");
        int count = scanner.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + count + " terms:");
        for (int i = 1; i <= count; i++) {
            System.out.print(first + " ");

            // Calculate next term
            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }
}


