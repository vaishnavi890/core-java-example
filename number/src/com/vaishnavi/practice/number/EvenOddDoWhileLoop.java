package com.vaishnavi.practice.number;

import java.util.Scanner;

public class EvenOddDoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to check? ");
        int count = scanner.nextInt();

        int i = 1;

        do {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is Even.");
            } else {
                System.out.println(number + " is Odd.");
            }

            i++;
        } while (i <= count);

        scanner.close();
    }
}

