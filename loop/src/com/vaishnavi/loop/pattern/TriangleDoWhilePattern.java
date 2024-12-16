package com.vaishnavi.loop.pattern;

public class TriangleDoWhilePattern {
        public static void main(String[] args) {
            int rows = 5; // Total rows in the pattern
            int currentRow = 1;

            do {
                int spaces = rows - currentRow; // Calculate leading spaces
                int stars = currentRow;

                // Print leading spaces
                do {
                    if (spaces > 0) {
                        System.out.print(" ");
                    }
                    spaces--;
                } while (spaces > 0);

                // Print stars with spaces
                int starCounter = 1;
                do {
                    System.out.print("*");
                    if (starCounter < stars) {
                        System.out.print(" ");
                    }
                    starCounter++;
                } while (starCounter <= stars);

                System.out.println(); // Move to the next line
                currentRow++;
            } while (currentRow <= rows);
        }
    }


