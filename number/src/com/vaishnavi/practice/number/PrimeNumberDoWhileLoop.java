package com.vaishnavi.practice.number;

import java.util.Scanner;

public class PrimeNumberDoWhileLoop {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter no....");
        int no = scanner.nextInt();

        int index = 1;
        do {
            index++;
        } while (no % index != 0);

        System.out.println((index == no) ? "prime" : "not prime");

    }
}
