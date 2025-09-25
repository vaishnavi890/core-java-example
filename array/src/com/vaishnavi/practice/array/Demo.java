package com.vaishnavi.practice.array;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 2, 1, 3, 43};

        for (int a : arr) {
            // Print the current element from array
            System.out.println("Element: " + a);

            // Loop through the array using index
            for (int i = 0; i < arr.length; i++) {
                // Print entire array as a string
                System.out.println("Array: " + Arrays.toString(arr));

                // Print index values from 0 to arr.length - 1
                int r = 0;
                while (r < arr.length) {
                    System.out.println("Index: " + r);
                    r++;
                }
            }
        }
    }
}
