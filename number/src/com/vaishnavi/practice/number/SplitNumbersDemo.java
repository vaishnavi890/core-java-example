package com.vaishnavi.practice.number;

import java.util.Scanner;

public class SplitNumbersDemo {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter positive number: ");
        int no = sc.nextInt();

        int[] digit = new int[String.valueOf(no).length()];
        int index = -1;
        while (no > 0) {
            digit[++index] = no % 10;
            no = no / 10;
        }
        index = digit.length;
        System.out.println("Split digit:");
        while (--index >= 0) {
            System.out.println(digit[index]);
        }
    }
}

