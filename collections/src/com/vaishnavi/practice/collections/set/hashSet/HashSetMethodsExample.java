package com.vaishnavi.practice.collections.set.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethodsExample {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        // 1. Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20); // Duplicate ignored

        // 2. Display elements
        System.out.println("Numbers: " + numbers);

        // 3. Check if HashSet is empty
        System.out.println("Is HashSet empty? " + numbers.isEmpty());

        // 4. Check size of HashSet
        System.out.println("Size of HashSet: " + numbers.size());

        // 5. Check if an element exists
        System.out.println("Does HashSet contain 30? " + numbers.contains(30));

        // 6. Remove an element
        numbers.remove(10);
        System.out.println("After removing 10: " + numbers);

        // 7. Iterate using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 8. Clear all elements
        numbers.clear();
        System.out.println("\nAfter clearing HashSet: " + numbers);
    }
}


