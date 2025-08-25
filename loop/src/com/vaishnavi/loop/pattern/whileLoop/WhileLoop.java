package com.vaishnavi.loop.pattern.whileLoop;

import java.util.Scanner;

public class WhileLoop {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int range = sc.nextInt();
        incrementOperator(range);
        decrementOperator(range);
    }

    public static void incrementOperator(int range) {
        System.out.println("========================increment operator====================== ");
        int no = 1;
        while (no < range) {
            System.out.println(no);
            no++;
        }
    }

    public static void decrementOperator(int range) {
        System.out.println("================decrement operator=====================");
        while (range >= 1) {
            System.out.println(range);
            range--;
        }

    }
}
