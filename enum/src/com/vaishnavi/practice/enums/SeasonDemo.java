package com.vaishnavi.practice.enums;

public class SeasonDemo {
    public enum Season { WINTER, SPRING, SUMMER, FALL }
    //main method
    public static void main(String[] args) {
//traversing the enum
        for (Season s : Season.values())
            System.out.println(s);
    }
}

