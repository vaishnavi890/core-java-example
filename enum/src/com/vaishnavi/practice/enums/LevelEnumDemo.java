package com.vaishnavi.practice.enums;

import java.util.Scanner;

public class LevelEnumDemo {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Pls enter temperature level:");
        String levelString = scanner.nextLine(); // low

        Level temparatureLevel = Level.valueOf(levelString);

        System.out.println("Current level: " + temparatureLevel);

    }
}

