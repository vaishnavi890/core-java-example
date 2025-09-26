package com.vaishnavi.practice.array.another;

public class MultiplicationTable2D {
    public static void main(String[] args) {
        int[][] table = new int[5][5]; // 5x5 table

        // Fill table with multiplication values
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                table[i-1][j-1] = i * j;
            }
        }

        System.out.println("Multiplication Table:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
