package com.vaishnavi.operator.relational;

import java.util.Scanner;

public class AgeRestriction {
    //pseudocode
    //check age is >=18 then eligible for vote otherwise not
    //age is < 18 candidate is not eligible

    public static void main(String[] args) {
        System.out.println("Enter your age..!");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age < 18){
            System.out.println("you are not eligible for the vote.. ");
        }
        else if(age >= 30){
            System.out.println("you are eligible for the vote");
        }
        System.out.println("Thank You!");

    }
}

