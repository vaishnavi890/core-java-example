package com.vaishnavi.loop.pattern;

public class RightAlignWhilePattern {
        public static void main(String[] args) {
            int i = 5; // Total rows in the pattern
            int j = 1;

            while (j <= i) {
                int no = i - j;
                int stars = j;

                // Print spaces
                while (no > 0) {
                    System.out.print(" ");
                    no--;
                }

                // Print stars
                while (stars > 0) {
                    System.out.print("*");
                    stars--;
                }

                System.out.println(); // Move to the next line
                j++;
            }
        }
    }


