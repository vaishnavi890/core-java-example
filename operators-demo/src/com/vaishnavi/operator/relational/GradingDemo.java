package com.vaishnavi.operator.relational;

import java.util.Scanner;

public class GradingDemo {
    //pseudocode
    //if marks is less than 50 then D.
    // marks is greater than 50 to 70 . c grade
    // marks is greater than 70 to 90 b grade
    // greater than 90 A grade.

    public static void main(String[] args) {
        System.out.println("Enter the marks..");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();

        if(grade >= 90){
            System.out.println("A grade");
        }
        else if(grade >= 70 && grade < 75){
            System.out.println("B grade");
        }
        else if(grade >= 50 && grade < 70){
            System.out.println("C grade");
        }
        else{
            System.out.println("D");
        }
    }
}

