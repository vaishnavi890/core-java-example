package com.vaishnavi.loop.pattern.whileLoop;

import java.util.Scanner;


public class WhileLoopFibonacciSeries {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number ");
        int no = scanner.nextInt();
        int i = 1, fname = 0, sname = 1;

        while (i <= no) {
            System.out.println(fname);

            int nextNo = fname + sname;
            fname = sname;
            sname = nextNo;
            i++;
        }

    }
}
