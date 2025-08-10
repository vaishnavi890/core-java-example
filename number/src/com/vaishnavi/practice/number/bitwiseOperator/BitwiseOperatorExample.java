package com.vaishnavi.practice.number.bitwiseOperator;

public class BitwiseOperatorExample {
    public static void main(String[] args) {
        int a = 5;  // binary: 0101
        int b = 3;  // binary: 0011

        System.out.println("a = " + a + " (binary: 0101)");
        System.out.println("b = " + b + " (binary: 0011)");

        // Bitwise AND
        System.out.println("a & b = " + (a & b)); // 0001 -> 1

        // Bitwise OR
        System.out.println("a | b = " + (a | b)); // 0111 -> 7

        // Bitwise XOR
        System.out.println("a ^ b = " + (a ^ b)); // 0110 -> 6

        // Bitwise NOT
        System.out.println("~a = " + (~a));       // flips bits -> -6

        // Left shift
        System.out.println("a << 1 = " + (a << 1)); // 1010 -> 10

        // Right shift
        System.out.println("a >> 1 = " + (a >> 1)); // 0010 -> 2

        // Unsigned right shift
        int c = -8;
        System.out.println("c = " + c);
        System.out.println("c >>> 2 = " + (c >>> 2));
    }
}

