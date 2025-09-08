package com.vaishnavi.practice.collections.set.treeSet;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetAllMethodsExample2 {
    public static void main(String[] args) {

        // Create TreeSet of Strings
        TreeSet<String> cities = new TreeSet<>();

        // Adding elements
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Hyderabad");

        System.out.println("Cities TreeSet: " + cities);

        // Adding duplicate (ignored)
        cities.add("Pune");

        // Size of TreeSet
        System.out.println("Size: " + cities.size());

        // First and Last elements
        System.out.println("First City: " + cities.first());
        System.out.println("Last City: " + cities.last());

        // Higher, Lower, Ceiling, Floor
        System.out.println("Higher than Mumbai: " + cities.higher("Mumbai"));
        System.out.println("Lower than Mumbai: " + cities.lower("Mumbai"));
        System.out.println("Ceiling for 'Chennai': " + cities.ceiling("Chennai"));
        System.out.println("Floor for 'Chennai': " + cities.floor("Chennai"));

        // Checking if element exists
        System.out.println("Contains Delhi? " + cities.contains("Delhi"));

        // Iterating in Ascending Order
        System.out.println("\nAscending Order Iteration:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Iterating in Descending Order
        System.out.println("\nDescending Order Iteration:");
        Iterator<String> descItr = cities.descendingIterator();
        while (descItr.hasNext()) {
            System.out.println(descItr.next());
        }

        // Removing specific element
        cities.remove("Delhi");
        System.out.println("\nAfter removing Delhi: " + cities);

        // Removing first and last elements
        cities.pollFirst();
        cities.pollLast();
        System.out.println("After pollFirst & pollLast: " + cities);

        // Clearing all elements
        cities.clear();
        System.out.println("After clear(), isEmpty? " + cities.isEmpty());
    }
}
