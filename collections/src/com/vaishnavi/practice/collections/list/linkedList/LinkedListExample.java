package com.vaishnavi.practice.collections.list.linkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating LinkedList of Strings
        LinkedList<String> names = new LinkedList<>();

        // 1. Adding elements
        names.add("Vaishnavi");
        names.add("Rohan");
        names.add("Priya");
        names.add("Amit");

        // 2. Display LinkedList
        System.out.println("Names: " + names);

        // 3. Adding element at first and last
        names.addFirst("Sneha");
        names.addLast("Kiran");
        System.out.println("After adding first and last: " + names);

        // 4. Accessing elements
        System.out.println("First Name: " + names.getFirst());
        System.out.println("Last Name: " + names.getLast());
        System.out.println("Element at index 2: " + names.get(2));

        // 5. Removing elements
        names.removeFirst();
        names.removeLast();
        names.remove("Rohan");
        System.out.println("After removing elements: " + names);

        // 6. Size of LinkedList
        System.out.println("Total Names: " + names.size());

        // 7. Iterating using for-each loop
        System.out.println("\nIterating using for-each:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
