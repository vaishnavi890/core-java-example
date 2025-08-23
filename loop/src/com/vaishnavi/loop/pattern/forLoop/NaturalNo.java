package com.vaishnavi.loop.pattern.forLoop;

import java.util.Scanner;

public class NaturalNo {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number ");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}
