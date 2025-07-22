package com.vaishnavi.practice.java21feature.sequenceCollection;

import java.util.*;

public class LinkedListSequencedExample {
    public static void main(String[] args) {
        // LinkedList आता SequencedCollection ला support करतं
        SequencedCollection<Integer> numbers = new LinkedList<>();

        // addFirst आणि addLast वापरून values add करत आहोत
        numbers.addFirst(30);
        numbers.addLast(40);
        numbers.addFirst(20);
        numbers.addFirst(10);
        numbers.addLast(50);

        System.out.println("Full list: " + numbers);

        // First आणि Last element print
        System.out.println("First number: " + numbers.getFirst());
        System.out.println("Last number: " + numbers.getLast());

        // Reversed list
        SequencedCollection<Integer> reversed = numbers.reversed();
        System.out.println("Reversed list: " + reversed);

        // Remove first आणि last
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println("After removing first and last: " + numbers);
    }
}

