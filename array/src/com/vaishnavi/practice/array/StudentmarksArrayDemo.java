package com.vaishnavi.practice.array;

public class StudentmarksArrayDemo {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 34;
        marks[1] = 90;
        marks[2] = 76;
        marks[3] = 99;
        marks[4] = 88;
        System.out.println("size of array is " + marks.length);

        int position = 0;
        System.out.println("while loop demo");
        while (position < marks.length) {
            System.out.println(marks[position]);
            position++;
        }

        System.out.println("for loop demo");
        for (int index = 0; index < marks.length; index++) {
            System.out.println(marks[index]);
        }

        System.out.println("for each loop demo");
        for (int element : marks) {
            System.out.println(element);
        }
    }
}
