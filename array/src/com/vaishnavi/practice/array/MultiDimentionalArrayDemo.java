package com.vaishnavi.practice.array;

public class MultiDimentionalArrayDemo {
    public static void main(String[] args) {

        int[][] marks = new int[5][5];
        marks[0][0] = 55;
        marks[0][1] = 67;
        marks[0][2] = 55;
        marks[0][3] = 37;
        marks[0][4] = 23;

        marks[1][0] = 45;
        marks[1][1] = 99;
        marks[1][2] = 99;
        marks[1][3] = 99;
        marks[1][4] = 99;

        marks[2][0] = 99;
        marks[2][1] = 99;
        marks[2][2] = 66;
        marks[2][3] = 88;
        marks[2][4] = 23;

        marks[3][0] = 11;
        marks[4][1] = 34;
        marks[3][2] = 56;
        marks[3][3] = 22;
        marks[3][4] = 99;

        marks[4][0] = 99;
        marks[4][1] = 78;
        marks[4][2] = 56;
        marks[4][3] = 33;
        marks[4][4] = 99;

        System.out.println("Size of array " + marks.length);

        for (int row = 0; row < marks.length; row++) {
            for (int colun = 0; colun < marks.length; colun++) {
                System.out.print(marks[row][colun] + "\t");
            }
            System.out.println();
        }
    }
}
