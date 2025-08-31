package com.vaishnavi.practice.collections.list.linkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AllLinkedListMethods {
    public static void main(String[] args) {
        //Write a Java program to append the specified element to the end of a linked list.
        LinkedList<String> list = new LinkedList<>();
        list.add("red");
        list.add("green");
        list.add("black");
        list.add("white");
        list.add("pink");
        list.add("yellow");
        System.out.println("LinkedList is " + list);
        System.out.println("============================");

        //Write a Java program to iterate through all elements in a linked list.
        System.out.println("Original LinkedList is " + list);
        for (String element : list) {
            System.out.println(element);
        }

        System.out.println("============================");
        //Write a Java program to iterate through all elements in a linked list starting at the specified position.
        System.out.println("Original LinkedList is " + list);
        Iterator iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("============================");
        //Write a Java program to insert the specified element at the specified position in the linked list.
        System.out.println("Original LinkedList is " + list);
        list.add(1, "orororor");
        System.out.println("the linked list " + list);
        System.out.println("============================");

        //Write a Java program to insert elements into the linked list at the first and last positions.
        System.out.println("Original LinkedList is " + list);
        list.addFirst("white");
        list.addLast("Blue");
        System.out.println("first and last added " + list);

        System.out.println("============================");
        //Write a Java program to insert the specified element at the front of a linked list.
        System.out.println("Original LinkedList is " + list);
        list.offerFirst("Pink");
        System.out.println("front of linklist " + list);
        System.out.println("============================");

        //. Write a Java program to insert the specified element at the end of a linked list.
        System.out.println("Original LinkedList is " + list);
        list.offerLast("pink");
        System.out.println("list " + list);
        System.out.println("============================");

        // Write a Java program to insert some elements at the specified position into a linked list.
        System.out.println("Original LinkedList is " + list);
        LinkedList<String> flower_new = new LinkedList<>();
        flower_new.add("lil");
        flower_new.addAll(list);
        System.out.println("new list add all " + flower_new);
        System.out.println("============================");


        //Write a Java program to get the first and last occurrence of the specified elements in a linked list
        System.out.println("Original LinkedList is " + list);
        Object first_element = list.getFirst();
        System.out.println("1st " + first_element);
        Object last_Element = list.getLast();
        System.out.println("last " + last_Element);

        System.out.println("============================");

        //Write a Java program to display elements and their positions in a linked list.
        System.out.println("Original LinkedList is " + list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("element " + i + list.get(i));
        }
        System.out.println("============================");

        //. Write a Java program to remove a specified element from a linked list.

        System.out.println("Original LinkedList is " + list);
        list.remove(2);
        System.out.println("after remove 2nd " + list);

        System.out.println("============================");

        //Write a Java program to remove the first and last elements from a linked list.
        System.out.println("Original LinkedList is " + list);
        Object first_remove = list.remove();
        System.out.println("remove 1st " + first_remove);
        Object last_remover = list.removeLast();
        System.out.println("remove last " + last_remover);

        System.out.println("============================");

        //Write a Java program to remove all elements from a linked list.
        System.out.println("Original LinkedList is " + list);

        //list.clear();
        System.out.println("remove all " + list);
        System.out.println("============================");

        //Write a Java program that swaps two elements in a linked list.
        System.out.println("Original LinkedList is " + list);
        Collections.swap(list, 1, 0);
        System.out.println("after swap " + list);
        System.out.println("============================");

        // Write a Java program to shuffle elements in a linked list.
        System.out.println("Original LinkedList is " + list);
        Collections.shuffle(list);
        System.out.println("shuffling " + list);

        System.out.println("============================");
        //Write a Java program to join two linked lists.
        System.out.println("Original LinkedList is " + list);
        LinkedList a = new LinkedList<>();
        a.addAll(list);
        a.addAll(flower_new);
        System.out.println("New link list " + a);

        System.out.println("============================");
        // Write a Java program to copy a linked list to another linked list.
        System.out.println("Original LinkedList is " + list);
        a = (LinkedList) list.clone();
        System.out.println("clone " + a);

        System.out.println("============================");

        //Write a Java program to remove and return the first element of a linked list.
        System.out.println("Original LinkedList is " + list);
        list.pop();
        System.out.println("Linked list after pop operation:" + list);

        System.out.println("============================");

        //Write a Java program to retrieve, but not remove, the first element of a linked list.
        System.out.println("Original LinkedList is " + list);

        String x = list.peekFirst();
        System.out.println(x);
        System.out.println(list);
        System.out.println("============================");

        //Write a Java program to retrieve, but not remove, the last element of a linked list.
        String l = list.peekLast();
        System.out.println(l);

        System.out.println("============================");

        //Write a Java program to check if a particular element exists in a linked list.
        System.out.println("Original LinkedList is " + list);
        String message = (list.contains("pink")) ? "yes" : "no";
        System.out.println(message);

        System.out.println("============================");

        //Write a Java program to convert a linked list to an array list.
        System.out.println("Original LinkedList is " + list);

        List<String> array = new LinkedList<>(list);
        for (String str : array) {
            System.out.println(str);
        }

        System.out.println("============================");

        //Write a Java program to check if a linked list is empty or not.
        list.isEmpty();
        System.out.println(list);
        System.out.println("============================");

        //Write a Java program to replace an element in a linked list.
        System.out.println("Original LinkedList is " + list);

        list.set(0, "purple");
        System.out.println(list);
        System.out.println("============================");


        System.out.println("============================");
    }
}
