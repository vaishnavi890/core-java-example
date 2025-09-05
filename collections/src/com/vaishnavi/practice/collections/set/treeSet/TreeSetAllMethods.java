package com.vaishnavi.practice.collections.set.treeSet;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetAllMethods {
    public static void main(String[] args) {
        TreeSet<Integer> nos = new TreeSet<>();
        nos.add(1);
        nos.add(2);
        nos.add(3);
        nos.add(4);
        nos.add(5);
        nos.add(6);
        nos.add(7);
        nos.add(8);
        System.out.println("Numbers is " + nos);
        System.out.println("-----------------------------------");
        //Write a Java program to iterate through all elements in a tree set.
        for (Integer n : nos) {
            System.out.println(n);
        }
        System.out.println("-----------------------------------");

        //Write a Java program to add all the elements of a specified tree set to another tree set.
        TreeSet<Integer> nos1 = new TreeSet<>();
        nos1.add(1);
        nos1.add(10);
        nos1.add(11);
        System.out.println("treeset 2 " + nos1);
        nos.addAll(nos1);
        System.out.println("all " + nos);

        System.out.println("-----------------------------------");

        //Write a Java program to create a reverse order view of the elements contained in a given tree set.
        System.out.println("Original TreeSet " + nos);
        Iterator<Integer> iterator = nos.descendingIterator();
        System.out.println("nos in reverse order");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-----------------------------------");
        //Write a Java program to get the first and last elements in a tree set.
        System.out.println("first element " + nos.first());
        System.out.println("last element " + nos.last());

        System.out.println("-----------------------------------");
        //Write a Java program to clone a tree set list to another tree set.
        System.out.println(nos);
        nos.clone();
        System.out.println(nos);
        System.out.println("-----------------------------------");
        //Write a Java program to get the number of elements in a tree set.
        System.out.println("Original " + nos);
        System.out.println(nos.size());
        System.out.println("-----------------------------------");

        //Write a Java program to compare two tree sets.
        System.out.println("Original tree " + nos);
        System.out.println("second " + nos1);
        for (Integer e : nos) {
            System.out.println(nos1.contains(e) ? "yes" : "no");
        }
        System.out.println("-----------------------------------");
        //Write a Java program to find numbers less than 7 in a tree set.
        System.out.println("Original tree " + nos);
        SortedSet<Integer> lessthan7 = nos.headSet(7);
        System.out.println(lessthan7);
        System.out.println("----------------------------------");

        //Write a Java program to get the element in a tree set which is greater than or equal to the given element.
        System.out.println("Greater than or equal to 8 : " + nos.ceiling(8));
        System.out.println("Greater than or equal to 2 : " + nos.ceiling(2));

        System.out.println("----------------------------------");

        //Write a Java program to remove a given element from a tree set.


        System.out.println("----------------------------------");
        System.out.println("Original tree set: " + nos);
        System.out.println("remove 2 " + nos.remove(2));
        System.out.println("Original tree set: " + nos);

        System.out.println("----------------------------------");

        //Write a Java program to retrieve and remove the last element of a tree set.
        System.out.println("Original tree set: " + nos);

        System.out.println("Removes the last element: " + nos.pollLast());
        System.out.println("Tree set after removing last element: " + nos);
        System.out.println("Removes the last element: " + nos.pollFirst());
        System.out.println("Tree set after removing first element: " + nos);

        //Write a Java program to get an element in a tree set that has a lower value than the given element.
        System.out.println("Strictly less than 4 : " + nos.lower(4));
        System.out.println("Strictly less than 6 : " + nos.lower(6));


        //Write a Java program to get the element in a tree set strictly greater than or equal to the given element.

        System.out.println("Strictly greater than 76 : " + nos.higher(76));
        System.out.println("Strictly greater than 31 : " + nos.higher(31));

        //Write a Java program to get the element in a tree set less than or equal to the given element.
        System.out.println("Less than or equal to 86 : " + nos.floor(86));
        System.out.println("Less than or equal to 29 : " + nos.floor(29));


    }
}
