package com.vaishnavi.practice.collections.set.treeSet;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        // Creating a TreeSet
        TreeSet<String> fruits = new TreeSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");

        // Duplicate element won't be added
        fruits.add("Apple");

        // Displaying elements (sorted automatically)
        System.out.println("Fruits TreeSet: " + fruits);

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Checking if an element exists
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // Fetching first and last elements
        System.out.println("First Fruit: " + fruits.first());
        System.out.println("Last Fruit: " + fruits.last());

        // Iterating through TreeSet
        System.out.println("\nIterating TreeSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}


