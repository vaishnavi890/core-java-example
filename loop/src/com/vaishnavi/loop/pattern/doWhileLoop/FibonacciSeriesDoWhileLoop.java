package com.vaishnavi.loop.pattern.doWhileLoop;

import java.util.Scanner;

public class FibonacciSeriesDoWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int no = sc.nextInt();
        int n1 = 0, n2 = 1;
        int i = 1;

        do {
            System.out.println(n1);
            int nextNo = n1 + n2;
            n1 = n2;
            n2 = nextNo;
            i++;

        } while (i < no);
    }
}
