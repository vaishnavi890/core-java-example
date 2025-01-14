package com.vaishnavi.practice.strings;

public class StringBufferExample {
    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer sb = new StringBuffer("Vaishnavi");
        // Appending to the StringBuffer
        sb.append(", Chevale");
        // Inserting into the StringBuffer
        sb.insert(5, " Java");
        // Deleting from the StringBuffer
        sb.delete(5, 10);
        System.out.println(sb); // Output: Vaishnavi, Chevale
    }
}
