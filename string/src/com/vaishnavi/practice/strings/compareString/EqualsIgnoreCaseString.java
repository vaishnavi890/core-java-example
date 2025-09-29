package com.vaishnavi.practice.strings.compareString;

public class EqualsIgnoreCaseString {
    public static void main(String[] args) {
        String s1 = "RAM";
        String s2 = "ram";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
