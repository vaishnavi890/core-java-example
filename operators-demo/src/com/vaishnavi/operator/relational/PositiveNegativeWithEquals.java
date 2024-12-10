package com.vaishnavi.operator.relational;

import java.util.Scanner;

public class PositiveNegativeWithEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int no = Integer.parseInt(scanner.nextLine());

        if (no > 0) {
            System.out.println("number is positive or zero..");
        }
        else if(no == 0){
            System.out.println("no is zero");
        }
        else {
            System.out.println("number is negative..");
        }
    }
}


    


