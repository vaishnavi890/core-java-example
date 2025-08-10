package com.vaishnavi.practice.number.bitwiseOperator;

public class BitwiseExample {
    public static void main(String[] args) {
        int a = 5;   // 0101 in binary
        int b = 3;   // 0011 in binary

        // Bitwise AND (&)
        int andResult = a & b; // 0101 & 0011 = 0001 (1)

        // Bitwise OR (|)
        int orResult = a | b;  // 0101 | 0011 = 0111 (7)

        // Bitwise XOR (^)
        int xorResult = a ^ b; // 0101 ^ 0011 = 0110 (6)

        // Bitwise NOT (~)
        int notA = ~a;         // ~0101 = 1010 (Two's complement: -6)

        // Left shift (<<)
        int leftShift = a << 1; // 0101 << 1 = 1010 (10)

        // Right shift (>>)
        int rightShift = a >> 1; // 0101 >> 1 = 0010 (2)

        // Unsigned right shift (>>>)
        int unsignedRightShift = -8 >>> 2; // shifts in zeros at the left

        // Display results
        System.out.println("a & b  = " + andResult);
        System.out.println("a | b  = " + orResult);
        System.out.println("a ^ b  = " + xorResult);
        System.out.println("~a     = " + notA);
        System.out.println("a << 1 = " + leftShift);
        System.out.println("a >> 1 = " + rightShift);
        System.out.println("-8 >>> 2 = " + unsignedRightShift);
    }
}


