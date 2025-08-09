package com.vaishnavi.practice.number.logicalOperator;

import java.util.Scanner;

public class Marks {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter marks:");
        int no = Integer.parseInt(scanner.nextLine());

        if (no > 75) {
            System.out.println("District Student");
        } else if (no >= 60) {
            System.out.println("Student is Standard");
        } else if (no > 35) {
            System.out.println("Student is Average");
        } else if (no >= 0) {
            System.out.println("Student fail");
        } else {
            System.out.println("Invalid Marks");
        }
    }
}

