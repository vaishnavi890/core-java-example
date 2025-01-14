package com.vaishnavi.practice.strings;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Creating a StringBuilder
        StringBuilder sb = new StringBuilder("Vaishnavi");
        // Appending to the StringBuilder
        sb.append(", Chevale!");
        // Inserting into the StringBuilder
        sb.insert(5, " Java");
        // Deleting from the StringBuilder
        sb.delete(5, 10);
        System.out.println(sb); // Output: Vaishnavi, Chevale!
    }
}

