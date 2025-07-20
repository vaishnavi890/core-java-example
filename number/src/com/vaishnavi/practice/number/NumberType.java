package com.vaishnavi.practice.number;

import java.util.Scanner;

public class NumberType {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int no = sc.nextInt();

        if (no % 2 == 0) {
            if (no > 100) {
                System.out.println("This number is golden number");
            } else {
                System.out.println("this number is silver number");
            }
        } else {
            if (no > 100) {
                System.out.println("This number is platinum number");
            } else {
                System.out.println("this number is titanium number");
            }

        }

    }
}

