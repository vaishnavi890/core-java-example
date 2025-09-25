package com.vaishnavi.practice.array;

import java.util.Scanner;

public class StudentMarks {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter marks of 5 subject ");
        int[] subjectMarks = new int[5];

        subjectMarks[0] = sc.nextInt();
        subjectMarks[1] = sc.nextInt();
        subjectMarks[2] = sc.nextInt();
        subjectMarks[3] = sc.nextInt();
        subjectMarks[4] = sc.nextInt();
        System.out.println("Student marks ");

        int position = 0;
        while (position <= 4) {
            System.out.println("marks for subject -" + position + "=" + subjectMarks[position]);
            position++;
        }
    }
}
