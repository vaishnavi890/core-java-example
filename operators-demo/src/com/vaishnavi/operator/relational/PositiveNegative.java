package com.vaishnavi.operator.relational;

import java.util.Scanner;

public class PositiveNegative {
    //pseudocode
    //identify value positive or negative.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int no = sc.nextInt();

        if(no > 0){
            System.out.println("number is positive..");
        }
        else {
            System.out.println("number is negative..");
        }
    }
}

