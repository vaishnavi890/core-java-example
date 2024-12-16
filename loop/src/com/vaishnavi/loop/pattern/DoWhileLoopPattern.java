package com.vaishnavi.loop.pattern;

public class DoWhileLoopPattern {
        public static void main(String[] args) {
            int i = 5; // Total rows in the pattern

            do {
                int no = i;
                do {
                    System.out.print("*");
                    no--;
                } while (no > 0);

                System.out.println(); // Move to the next line
                i--;
            } while (i > 0);
        }
    }


