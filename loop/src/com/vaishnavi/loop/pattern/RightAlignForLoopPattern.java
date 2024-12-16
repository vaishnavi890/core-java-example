package com.vaishnavi.loop.pattern;

public class RightAlignForLoopPattern {
        public static void main(String[] args) {
            int i = 5; // Total rows in the pattern

            for (int j = 1; j <= i; j++) {
                // Print spaces
                for (int no = 1; no <= i - j; no++) {
                    System.out.print(" ");
                }

                // Print stars
                for (int stars = 1; stars <= j; stars++) {
                    System.out.print("*");
                }

                // Move to the next line
                System.out.println();
            }
        }
    }

