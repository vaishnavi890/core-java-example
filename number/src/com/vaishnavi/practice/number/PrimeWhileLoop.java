package com.vaishnavi.practice.number;

import java.util.Scanner;

public class PrimeWhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean flag = false;
        int i = 2;

        // Using while loop to check for divisibility
        while (i <= num / 2) {
            if (num % i == 0) {
                flag = true;
                break; // No need to check further
            }
            i++; // Increment i in the while loop
        }

        // Output the result based on the flag
        System.out.println((!flag) ? "prime" : "not prime");
    }
}

