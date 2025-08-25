package com.vaishnavi.loop.pattern.whileLoop;

import java.util.Scanner;

public class WhileLoopPractice1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter any number to check even or odd number");
        int no = scanner.nextInt();
        int n = 1;

        while (n <= no) {
            System.out.println((no % 2 == 0) ? "Even number " : " Odd number");
            break;
        }
    }
}
