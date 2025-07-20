package com.vaishnavi.practice.number;

public class PrimeNoWhileLoop {
public static void main(String[] args) {

    int num = 89; // Change this number to test
    int i = 2;
    boolean isPrime = true;

    while (i <= num / 2) {
        if (num % i == 0) {
            isPrime = false;
            break;
        }
        i++;
    }
    System.out.println((isPrime && num > 1) ? "prime " : " not prime");
}
}

