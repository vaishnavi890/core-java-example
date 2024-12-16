package com.vaishnavi.loop.pattern;

public class WhileLoopPattern {
    public static void main(String[] args) {
        int i = 5; // Total rows in the pattern

        while (i > 0) {
            int no = i;
            while (no > 0) {
                System.out.print("*");
                no--;
            }
            System.out.println(); // Move to the next line
            i--;
        }
    }
}


