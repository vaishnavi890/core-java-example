package com.vaishnavi.practice.strings;

public class StringExample1 {
    public static void main(String[] args) {
        // Using String (Immutable)
        String str = "Hello";
        System.out.println("Original String: " + str);

        // Concatenation creates a new object (immutable)
        str = str + " World";
        System.out.println("After Concatenation (String): " + str);

        // Using StringBuffer (Mutable and Thread-Safe)
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("\nOriginal StringBuffer: " + stringBuffer);

        // Append operation (modifies the same object)
        stringBuffer.append(" World");
        System.out.println("After Append (StringBuffer): " + stringBuffer);

        // Insert operation
        stringBuffer.insert(6, "Java ");
        System.out.println("After Insert (StringBuffer): " + stringBuffer);

        // Reverse operation
        stringBuffer.reverse();
        System.out.println("After Reverse (StringBuffer): " + stringBuffer);

        // Restore original string
        stringBuffer.reverse();
        System.out.println("Restored StringBuffer: " + stringBuffer);

        // Using StringBuilder (Mutable and Not Thread-Safe)
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println("\nOriginal StringBuilder: " + stringBuilder);

        // Append operation (modifies the same object)
        stringBuilder.append(" World");
        System.out.println("After Append (StringBuilder): " + stringBuilder);

        // Replace operation
        stringBuilder.replace(6, 11, "Java");
        System.out.println("After Replace (StringBuilder): " + stringBuilder);

        // Delete operation
        stringBuilder.delete(5, 10);
        System.out.println("After Delete (StringBuilder): " + stringBuilder);

        // Capacity of StringBuilder
        System.out.println("Capacity of StringBuilder: " + stringBuilder.capacity());
    }
}

