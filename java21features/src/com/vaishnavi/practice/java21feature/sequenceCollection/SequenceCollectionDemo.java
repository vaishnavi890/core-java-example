package com.vaishnavi.practice.java21feature.sequenceCollection;

import java.util.ArrayList;
import java.util.List;

//java 21 features
public class SequenceCollectionDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");

        System.out.println("original collection" + fruits);

        fruits.addFirst("cherry");
        fruits.addLast("Carrot");

        System.out.println("After adding first and last in collection " + fruits);

        String firstFruit = fruits.getFirst();
        System.out.println("first fruit " + firstFruit);
        String LastFruit = fruits.getLast();
        System.out.println("last fruit " + LastFruit);

        fruits.removeFirst();
        System.out.println("remove 1st fruits " + fruits);

        List<String> reversedFruits = fruits.reversed();
        System.out.println("reversed fruit " + reversedFruits);

    }
}

