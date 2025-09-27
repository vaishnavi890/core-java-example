package com.vaishnavi.practice.array.another;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {45, 12, 78, 34, 90, 11};

        int min = arr[0], max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}
