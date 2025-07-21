package com.vaishnavi.practice.number;

import java.util.Scanner;

public class SplitNumber {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter number");
        int no = scanner.nextInt();

        System.out.println("split number");
        int remainder = 0;
        while (no > 0) {
            remainder = no % 10;
            no = no / 10;
            System.out.println(remainder);
        }
    }
}
