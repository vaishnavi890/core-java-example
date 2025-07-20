package com.vaishnavi.practice.number;

import java.util.Scanner;

public class OddEvenDemo {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number");
        int no = sc.nextInt();

        if (no % 2 == 0) {
            System.out.println("no is even");
        } else {
            System.out.println("no is odd");
        }
    }
}