package com.vaishnavi.loop.pattern.forLoop;

public class NestedForLoop {
    public static void main(String[] args) {
        // Print multiplication table from 1 to 3
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
