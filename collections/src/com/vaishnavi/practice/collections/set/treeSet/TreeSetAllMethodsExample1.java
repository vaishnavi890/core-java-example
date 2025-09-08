package com.vaishnavi.practice.collections.set.treeSet;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetAllMethodsExample1 {
    public static void main(String[] args) {

        // Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(30);

        System.out.println("TreeSet Elements: " + numbers); // Sorted automatically

        // Adding a duplicate (will be ignored)
        numbers.add(30);

        // Checking size
        System.out.println("Size of TreeSet: " + numbers.size());

        // Checking if element exists
        System.out.println("Contains 20? " + numbers.contains(20));
        System.out.println("Contains 60? " + numbers.contains(60));

        // Fetching first and last elements
        System.out.println("First Element: " + numbers.first());
        System.out.println("Last Element: " + numbers.last());

        // Fetching higher, lower, ceiling, and floor
        System.out.println("Higher than 30: " + numbers.higher(30)); // Next greater
        System.out.println("Lower than 30: " + numbers.lower(30));   // Next smaller
        System.out.println("Ceiling of 25: " + numbers.ceiling(25)); // ≥ value
        System.out.println("Floor of 25: " + numbers.floor(25));     // ≤ value

        // Removing an element
        numbers.remove(40);
        System.out.println("After removing 40: " + numbers);

        // Adding all elements from another TreeSet
        TreeSet<Integer> moreNumbers = new TreeSet<>();
        moreNumbers.add(60);
        moreNumbers.add(70);
        numbers.addAll(moreNumbers);

        System.out.println("After addAll: " + numbers);

        // Removing all elements from another set
        numbers.removeAll(moreNumbers);
        System.out.println("After removeAll: " + numbers);

        // Iterating using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Clearing all elements
        numbers.clear();
        System.out.println("\nAfter clear, is TreeSet empty? " + numbers.isEmpty());
    }
}


