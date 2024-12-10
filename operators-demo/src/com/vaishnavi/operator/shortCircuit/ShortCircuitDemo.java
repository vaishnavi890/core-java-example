package com.vaishnavi.operator.shortCircuit;

import java.util.Scanner;

public class ShortCircuitDemo {
    // Pseudocode
    // print msg to enter no
    // accept no - convert to int
    // if number is positive
    // if it is positive -> check if its is even/odd - (no%2==0)
    // if it is even -> check if it is greater than 200
    // if it is odd -> check if it is less than 200
    // positive condition - else: check if number is divisible by 4

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pls enter the value: ");
        int no = Integer.parseInt(scanner.nextLine());

        if (0 <= no) {
            if (no % 2 == 0 || no > 200) {
                System.out.println("no is greater than 200 and even");
            } else {
                System.out.println("no is NOT greater than 200 and odd");
            }
        } else {
            if (no % 4 == 0) {
                System.out.println("no is divisible by 4");
            } else {
                System.out.println("no is NOT divisible by 4");
            }
        }

    }
}

