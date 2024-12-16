package com.vaishnavi.loop.pattern;

public class TriangleForLoopPattern {
        public static void main(String[] args) {
            int i = 5; // Total rows in the pattern

            for (int j = 1; j <= i; j++) {
                // Print leading no
                for (int spaces = 1; spaces <= i - j; spaces++) {
                    System.out.print(" ");
                }

                // Print stars with spaces
                for (int stars = 1; stars <= j; stars++) {
                    System.out.print("*");
                    if (stars < j) {
                        System.out.print(" ");
                    }
                }

                System.out.println(); // Move to the next line
            }
        }
    }

