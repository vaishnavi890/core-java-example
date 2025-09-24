package com.vaishnavi.practice.array;

import java.util.Scanner;

public class BasicDemoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int s = 0;
        if (sc.hasNextInt()) {
            s = sc.nextInt();
        }
        int[] array = new int[s];
        System.out.println("Enter the element of array");
        for (int i = 0; i < s; i++) {
            if (sc.hasNextInt()) {
                array[i] = sc.nextInt();
            }
        }
        System.out.println("the element of array are");
        for (int i = 0; i < s; i++) {
            System.out.println(array[i] + " ");
        }
        sc.close();
    }
}
