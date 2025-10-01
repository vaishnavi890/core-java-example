package com.vaishnavi.practice.strings.stringAllMethods;

public class StringAllMethods {
    public static void main(String[] args) {
        System.out.println("----------toUpperCase() method----------");
        //toUpperCase() method
        String s = "Sachin";
        System.out.println(s.toUpperCase());
        //toLowerCase() method
        System.out.println(s.toLowerCase());
        //no change in original
        System.out.println(s);

        System.out.println("---------------trim() method------------------");
        //trim() method
        System.out.println(s);
        System.out.println(s.trim());

        System.out.println("-----------------startsWith() and endsWith()----------------");
        System.out.println(s.startsWith("Sa"));//true
        System.out.println(s.endsWith("n")); //true
        System.out.println(s.endsWith("d")); //false

        System.out.println("-----------------charAt()----------------");
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(3));

        System.out.println("-----------------length()----------------");
        System.out.println(s.length());

        System.out.println("-----------------intern()----------------");
        System.out.println(s.intern());
    }
}
