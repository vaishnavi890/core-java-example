package com.vaishnavi.loop.pattern.forLoop;

public class FibonacciSeriesForLoop {
    public static void main(String[] args) {
        int n = 10, fname = 0, sname = 1;

        System.out.println("Fibonacci series till " + n + " terms ");

        for (int i = 1; i <= n; i++) {
            System.out.println(fname);

            int nextNumber = fname + sname;
            fname = sname;
            sname = nextNumber;

        }
    }
}
