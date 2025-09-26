package com.vaishnavi.practice.array.another;

public class StudentMarksArray {
    public static void main(String[] args) {
        int[][] marks = {
                {85, 90, 78},  // Student 1 marks
                {88, 76, 92},  // Student 2 marks
                {90, 80, 85}   // Student 3 marks
        };

        System.out.println("Student Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
