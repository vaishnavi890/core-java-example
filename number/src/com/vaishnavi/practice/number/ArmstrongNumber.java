package com.vaishnavi.practice.number;

import java.util.Scanner;

/*
write a program to print armstrong number between 1 and 500. if sum of cubs
of each digit of the number is equal to the number itself, then called as armstrong no.
foe e.g. 153 = (1*1*1) + (5*5*5) + (3*3*3)
 */
public class ArmstrongNumber {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        System.out.println("enter number to check");
        int no = scanner.nextInt();
        int copy = no;
        String n = Integer.toString(no);
        int len = n.length();
        while (no != 0) {
            int rem = no % 10;
            int mul = 1;
            for (int i = 1; i <= len; i++) {
                mul *= rem;
            }
            sum += mul;
            no /= 10;
        }
        if (sum == copy) {
            System.out.println(copy + " Armstrong Number");
        } else {
            System.out.println(copy + "Armstrong not Number");
        }
    }
}

