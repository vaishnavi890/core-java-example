package com.vaishnavi.practice.collections.set.hashSet;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet of Strings
        HashSet<String> fruits = new HashSet<>();

        // Adding elements to HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate element, will not be added

        // Display HashSet
        System.out.println("Fruits: " + fruits);

        // Check if an element exists
        if (fruits.contains("Mango")) {
            System.out.println("Mango is in the set");
        }

        // Remove an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Size of the HashSet
        System.out.println("Total fruits: " + fruits.size());

        // Iterating through HashSet using for-each loop
        System.out.println("\nIterating over HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}


