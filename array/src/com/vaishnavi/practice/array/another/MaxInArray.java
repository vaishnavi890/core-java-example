package com.vaishnavi.practice.array.another;

public class MaxInArray {
    public static void main(String[] args) {
        int[] numbers = {15, 25, 7, 40, 32};

        int max = numbers[0];  // assume first element is max
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum number in array: " + max);
    }

}
