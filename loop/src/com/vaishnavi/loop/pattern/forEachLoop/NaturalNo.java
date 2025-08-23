package com.vaishnavi.loop.pattern.forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NaturalNo {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> naturalNo = new ArrayList<>();
        System.out.println("Enter number");
        int no = scanner.nextInt();
        int i = 1;

        while (i <= no) {
            System.out.println(i);
            i++;
        }
        for (int j : naturalNo) {
            System.out.println(j);
        }
    }
}
