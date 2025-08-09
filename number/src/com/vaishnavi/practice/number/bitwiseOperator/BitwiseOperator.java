package com.vaishnavi.practice.number.bitwiseOperator;

import java.util.Scanner;

public class BitwiseOperator {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number.!");
        int firstValue = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number.!");
        int secondValue = Integer.parseInt(scanner.nextLine());

        int output = firstValue | secondValue;

        System.out.println("output = " + output);

    }
}

