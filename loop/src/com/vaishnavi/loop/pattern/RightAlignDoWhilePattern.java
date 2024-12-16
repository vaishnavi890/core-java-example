package com.vaishnavi.loop.pattern;

public class RightAlignDoWhilePattern {
        public static void main(String[] args) {
            int i = 5; // Total rows in the pattern
            int j = 1;

            do {
                int no = i - j;
                int stars = j;

                // Print spaces
                do {
                    if (no > 0) {
                        System.out.print(" ");
                    }
                    no--;
                } while (no > 0);

                // Print stars
                do {
                    if (stars > 0) {
                        System.out.print("*");
                    }
                    stars--;
                } while (stars > 0);

                System.out.println(); // Move to the next line
                j++;
            } while (j <= i);
        }
    }


