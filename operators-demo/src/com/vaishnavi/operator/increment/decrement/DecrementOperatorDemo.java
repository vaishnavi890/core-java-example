package com.vaishnavi.operator.increment.decrement;

import java.util.Scanner;

public class DecrementOperatorDemo {
    public static void main(String[] args) {
        //pseudocode
        //increment operator - accept one no from user and print(no + 1)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive number..");
        int no = sc.nextInt();

        System.out.println("Entered value " + no);
        no--;
        System.out.println("Decremental value..." + no);

    }
}

