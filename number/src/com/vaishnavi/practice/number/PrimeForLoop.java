package com.vaishnavi.practice.number;

public class PrimeForLoop{
public static void main(String[] args) {
    int num = 2;
    boolean flag = false;

    for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
            flag = true;
            break;
        }
    }
    System.out.println((!flag) ? "prime" : "not prime");
}
}
