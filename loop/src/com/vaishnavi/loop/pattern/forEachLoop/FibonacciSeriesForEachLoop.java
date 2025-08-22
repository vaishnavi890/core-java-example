package com.vaishnavi.loop.pattern.forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeriesForEachLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int fname = 0, sname = 1;

        List<Integer> fibo = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println(fname);

            int nextno = fname + sname;
            fname = sname;
            sname = nextno;

        }
        for (int fiboono : fibo) {
            System.out.println(fiboono);
        }
    }
}
