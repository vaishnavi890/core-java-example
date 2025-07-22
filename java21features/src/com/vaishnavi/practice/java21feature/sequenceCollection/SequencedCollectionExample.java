package com.vaishnavi.practice.java21feature.sequenceCollection;

import java.util.*;

public class SequencedCollectionExample {
    public static void main(String[] args) {
        // Using ArrayList which implements SequencedCollection
        SequencedCollection<String> names = new ArrayList<>();

        // Add elements
        names.addFirst("Alice");
        names.addLast("Bob");
        names.addLast("Charlie");

        // Print the entire list
        System.out.println("Original Order: " + names);

        // Access first and last
        System.out.println("First Element: " + names.getFirst());
        System.out.println("Last Element: " + names.getLast());

        // Remove from ends
        names.removeFirst();
        names.removeLast();
        System.out.println("After removing first and last: " + names);

        // Reversed view
        SequencedCollection<String> reversed = names.reversed();
        System.out.println("Reversed Order: " + reversed);
    }
}


