package com.vaishnavi.practice.number;

import java.util.Scanner;

public class PrimeNoDoWhile {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number");
        int no = sc.nextInt();
        int index = 1;
        do {
            index++;
        } while (no % index != 0);
        if (index == no) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
