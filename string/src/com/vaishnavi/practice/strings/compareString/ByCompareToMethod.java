package com.vaishnavi.practice.strings.compareString;

public class ByCompareToMethod {
    public static void main(String[] args) {
        String s1 = "ram";
        String s2 = "ram";
        String s3 = "abc";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s1));
    }
}
