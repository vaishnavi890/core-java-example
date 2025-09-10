package com.vaishnavi.practice.collections.set.hashSet;

import java.util.HashSet;

public class HashSetOperationsExample {
    public static void main(String[] args) {
        // First HashSet
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);

        // Second HashSet
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(30);
        set2.add(40);
        set2.add(50);
        set2.add(60);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        // 1. UNION → addAll()
        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("\nUnion: " + union);

        // 2. INTERSECTION → retainAll()
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        // 3. DIFFERENCE → removeAll()
        HashSet<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference (Set1 - Set2): " + difference);

        // 4. Check if a set contains all elements of another set
        System.out.println("\nDoes Set1 contain Set2? " + set1.containsAll(set2));

        // 5. Clone a HashSet
        HashSet<Integer> clonedSet = (HashSet<Integer>) set1.clone();
        System.out.println("Cloned Set1: " + clonedSet);

        // 6. Clear the cloned set
        clonedSet.clear();
        System.out.println("After clearing cloned set: " + clonedSet);
    }
}

