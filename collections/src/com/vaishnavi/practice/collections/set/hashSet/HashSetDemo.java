package com.vaishnavi.practice.collections.set.hashSet;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<Integer> hashset = new HashSet<>();
        hashset.add(1);
        hashset.add(2);
        hashset.add(2); // not print because duplicate values are not allowed

        System.out.println("values are " + hashset);
        System.out.println(hashset.clone());
        System.out.println("hashset example " + hashset);
        System.out.println(hashset.size());
        System.out.println("remove" + hashset.remove(1));
        System.out.println(hashset.size());

    }
}
