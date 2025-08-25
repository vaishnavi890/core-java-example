package com.vaishnavi.loop.pattern.whileLoop;

public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        int no = 7;

        System.out.println("Even Number");
        while (i <= no) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
            i++;
        }
        System.out.println("odd number");
        i = 1;
        while (i <= no) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
