package com.vaishnavi.loop.pattern.forEachLoop;

public class Simple {
    public static void main(String[] args) {
        int[] no = new int[4];
        no[0] = 10;
        no[1] = 10;
        no[2] = 10;
        no[3] = 10;
        for (int number : no) {
            System.out.println(number);
        }
    }

}
