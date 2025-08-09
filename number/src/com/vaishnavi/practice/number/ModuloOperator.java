package com.vaishnavi.practice.number;

import java.util.Scanner;

public class ModuloOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values");
        int no = Integer.parseInt(scanner.nextLine());
        System.out.println("enter the divisible value:");
        int divisibleValue = Integer.parseInt(scanner.nextLine());

        int output = no / divisibleValue;
        int remainder = no % divisibleValue;

        System.out.println("divisible output = " + output);
        System.out.println("remainder = " + remainder);
    }
}

