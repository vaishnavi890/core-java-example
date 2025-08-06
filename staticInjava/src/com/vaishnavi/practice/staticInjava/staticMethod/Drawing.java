package com.vaishnavi.practice.staticInjava.staticMethod;

public class Drawing {
        // Static method to draw a square of given size
        public static void drawSquare(int size) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        // Static method to draw a right-angled triangle
        public static void drawTriangle(int height) {
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            System.out.println("Drawing a square of size 4:");
            drawSquare(4);

            System.out.println("\nDrawing a triangle of height 5:");
            drawTriangle(5);
        }
    }


