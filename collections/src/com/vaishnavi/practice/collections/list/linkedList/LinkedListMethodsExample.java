package com.vaishnavi.practice.collections.list.linkedList;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListMethodsExample {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        // 1. Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // 2. Display LinkedList
        System.out.println("Numbers: " + numbers);

        // 3. Adding at specific position
        numbers.add(2, 25);
        System.out.println("After adding 25 at index 2: " + numbers);

        // 4. Checking size and if empty
        System.out.println("Size: " + numbers.size());
        System.out.println("Is LinkedList empty? " + numbers.isEmpty());

        // 5. Check if contains an element
        System.out.println("Contains 30? " + numbers.contains(30));

        // 6. Access elements
        System.out.println("First Element: " + numbers.getFirst());
        System.out.println("Last Element: " + numbers.getLast());

        // 7. Removing elements
        numbers.removeFirst();
        numbers.removeLast();
        numbers.remove(Integer.valueOf(25));
        System.out.println("After removals: " + numbers);

        // 8. Peek and Poll (Queue Methods)
        System.out.println("Peek (head element): " + numbers.peek());
        System.out.println("Poll (removes head): " + numbers.poll());
        System.out.println("After poll: " + numbers);

        // 9. Iterating using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 10. Clearing the LinkedList
        numbers.clear();
        System.out.println("\nAfter clearing LinkedList: " + numbers);
    }
}

