package com.vaishnavi.practice.number;

import java.util.Scanner;

public class NestedIfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int no = Integer.parseInt(scanner.nextLine());
        if (0 <= no) {
            System.out.println("Number is positive or zero..");
            if (no % 2 == 0) {
                System.out.println("even");
                if (no > 100) {
                    System.out.println("greater than 100");
                } else {
                    System.out.println("no is not greater than 100");
                }
            } else {
                System.out.println("odd");
                if (no < 100) {
                    System.out.println("no is less greater than 100");
                } else {
                    System.out.println("no is not less than 100");
                }
            }
        } else {
            System.out.println("no is negative");
            if (no % 5 == 0) {
                System.out.println("divisible by 5");
            } else {
                System.out.println("not divisible by 5");
            }
        }
    }
}

