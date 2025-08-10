package com.vaishnavi.practice.number.bitwiseOperator;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011

        System.out.println("a = " + a + " (binary: 0101)");
        System.out.println("b = " + b + " (binary: 0011)");

        // AND (&)
        System.out.println("a & b = " + (a & b)); // 0001 -> 1

        // OR (|)
        System.out.println("a | b = " + (a | b)); // 0111 -> 7

        // XOR (^)
        System.out.println("a ^ b = " + (a ^ b)); // 0110 -> 6

        // NOT (~)
        System.out.println("~a = " + (~a)); // Flips bits -> -6

        // Left Shift (<<)
        System.out.println("a << 1 = " + (a << 1)); // 1010 -> 10

        // Right Shift (>>)
        System.out.println("a >> 1 = " + (a >> 1)); // 0010 -> 2

        // Unsigned Right Shift (>>>)
        int c = -8; // Binary: 11111111111111111111111111111000
        System.out.println("c = " + c);
        System.out.println("c >>> 2 = " + (c >>> 2));
    }
}


