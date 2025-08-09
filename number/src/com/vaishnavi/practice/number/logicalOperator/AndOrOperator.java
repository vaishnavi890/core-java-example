package com.vaishnavi.practice.number.logicalOperator;

import java.util.Scanner;

public class AndOrOperator {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter positive number: ");
        int no = sc.nextInt();
        if (no % 2 == 0 || no > 100) {
            System.out.println("even not greater than 100");
        } else {
            System.out.println("even  greater than 100");

        }

    }
}

