package com.vaishnavi.loop.pattern;

public class TriangleWhilePattern {
        public static void main(String[] args) {
            int i = 5; // Total i in the pattern
            int row = 1;

            while (row <= i) {
                int spaces = i - row; // Calculate leading spaces
                int stars = row;

                // Print leading spaces
                while (spaces > 0) {
                    System.out.print(" ");
                    spaces--;
                }

                // Print stars with spaces
                int starCounter = 1;
                while (starCounter <= stars) {
                    System.out.print("*");
                    if (starCounter < stars) {
                        System.out.print(" ");
                    }
                    starCounter++;
                }

                System.out.println(); // Move to the next line
                row++;
            }
        }
    }

