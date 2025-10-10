package com.vaishnavi.practice.strings.subString;

public class SubstringExample {
    public static void main(String[] args) {
        String text = "Hello Java World";

        // Extract substring from index 6 to end
        String part1 = text.substring(6);
        System.out.println("Substring from index 6: " + part1);

        // Extract substring from index 0 to 5 (end index is exclusive)
        String part2 = text.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + part2);

        // Extract middle part
        String part3 = text.substring(6, 10);
        System.out.println("Substring from index 6 to 10: " + part3);
    }
}
