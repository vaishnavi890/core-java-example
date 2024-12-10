package com.vaishnavi.operator.relational;

import java.util.Scanner;

public class EvenOdd {
    //pseudocode
    //check number is even or odd.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the check no is even or odd");
        int no = sc.nextInt();

        if(no % 2 ==0){
            System.out.println("Number is even..");
        }
        else{
            System.out.println("Number is odd..");
        }
    }
}
