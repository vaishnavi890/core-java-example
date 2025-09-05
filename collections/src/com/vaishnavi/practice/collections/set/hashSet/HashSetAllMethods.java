package com.vaishnavi.practice.collections.set.hashSet;

import java.util.*;

public class HashSetAllMethods {
    public static void main(String[] args) {
        //Write a Java program to append the specified element to the end of a hash set.
        HashSet<String> colors = new HashSet<>();
        // use add() method to add values in the hash set
        colors.add("Red");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Lavender");
        System.out.println("Colors list is " + colors);
        System.out.println("------------------------------------");

        //Write a Java program to iterate through all elements in a hash list.
        // set Iterator
        Iterator<String> p = colors.iterator();
        // Iterate the hash set
        while (p.hasNext())
            System.out.println(p.next());
        System.out.println("------------------------------------");
        //Write a Java program to get the number of elements in a hash set.
        System.out.println("original " + colors);
        System.out.println("After " + colors.size());
        System.out.println("------------------------------------");
        //Write a Java program to empty an hash set.
        System.out.println("original " + colors);
        //colors.removeAll(colors);
        System.out.println("after" + colors);
        System.out.println("------------------------------------");

        //Write a Java program to test if a hash set is empty or not.
        System.out.println("after" + colors);
        System.out.println("Checking  the above array from a hash set " + colors.isEmpty());
        System.out.println("Remove all the elements from a Hash Set: ");
        //colors.removeAll(colors);
        System.out.println("Hash Set after removing all the elements " + colors);
        System.out.println("------------------------------------");

        //Write a Java program to clone a hash set to another hash set.
        System.out.println("original " + colors);
        HashSet<String> c = new HashSet<>();
        c = (HashSet) colors.clone();
        System.out.println("clone  " + c);
        System.out.println("------------------------------------");

        //Write a Java program to convert a hash set to an array.
        System.out.println("original " + colors);
        String[] newArray = new String[colors.size()];
        colors.toArray(newArray);
        System.out.println("Array Element");
        for (String element : newArray) {
            System.out.println(element);
        }

        System.out.println("------------------------------------");

        //Write a Java program to convert a hash set to a tree set.
        System.out.println("original " + colors);
        Set<String> tree_set = new TreeSet<>(colors);
        System.out.println("TreeSet element:");
        for (String e : tree_set) {
            System.out.println(e);
        }
        System.out.println("------------------------------------");
        //Write a Java program to find numbers less than 7 in a tree set.
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(16);
        treeSet.add(9);
        treeSet.add(5);
        treeSet.add(11);

        SortedSet<Integer> lessThan7 = treeSet.headSet(11); // excludes 7
        System.out.println("Original TreeSet: " + treeSet);
        System.out.println("Elements less than 7: " + lessThan7);

        System.out.println("------------------------------------");
        //Write a Java program to compare two hash set.
        HashSet<String> c2 = new HashSet<>();
        for (String e : colors) {
            System.out.println(c.contains(e) ? "yes" : "no");
        }

        System.out.println("------------------------------------");

        //Write a Java program to compare two sets and retain elements that are the same.
//        c.add("blue");
//        c.add("Pink");
        colors.retainAll(c);
        System.out.println("HashSet content" + c);

        System.out.println("------------------------------------");

        //Write a Java program to remove all elements from a hash set.
        colors.clear();
        System.out.println(colors);

        System.out.println("------------------------------------");
    }
}
