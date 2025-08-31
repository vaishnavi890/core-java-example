package com.vaishnavi.practice.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapAllMethods {
    public static void main(String[] args) {

        //Write a Java program to associate the specified value with the specified key in a HashMap.
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "shreya");
        hashMap.put(2, "reeya");
        hashMap.put(3, "rio");
        hashMap.put(4, "teena");
        hashMap.put(5, "piya");
        System.out.println("Original Map is " + hashMap);
        for (Map.Entry x : hashMap.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }

        //Write a Java program to count the number of key-value (size) mappings in a map.

        System.out.println("Size of th hash map " + hashMap.size());

        //Write a Java program to copy all mappings from the specified map to another map.
        HashMap hash_map1 = new HashMap<>();
        hash_map1.put(5, "abc");
        hash_map1.put(6, "bsd");
        hash_map1.put(7, "asd");
        System.out.println("First map " + hashMap);
        System.out.println("Second map " + hash_map1);
        hashMap.putAll(hash_map1);
        System.out.println("After result " + hashMap);

        //Write a Java program to remove all mappings from a map.

        hash_map1.clear();
        System.out.println("after clear map 2" + hash_map1);

        //Write a Java program to check whether a map contains key-value mappings (empty) or not.
        hashMap.isEmpty();
        System.out.println(hashMap);
        hash_map1.isEmpty();
        System.out.println(hash_map1);

        //Write a Java program to get a shallow copy of a HashMap instance.
        hash_map1 = (HashMap) hashMap.clone();
        System.out.println(hash_map1);

        //Write a Java program to test if a map contains a mapping for the specified key.
        if (hashMap.containsKey(1)) {
            System.out.println("Yes, key 1 is present with value: " + hashMap.get(1));
        } else {
            System.out.println("Key 1 not found");
        }

        if (hashMap.containsValue("shreya")) {
            System.out.println("Yes, value 'shreya' is present.");
        } else {
            System.out.println("Value 'shreya' not found.");
        }

        if (hashMap.containsValue("reeya")) {
            System.out.println("yes reeya is present");
        } else {
            System.out.println("not present");
        }
        if (hashMap.containsKey(3)) {
            System.out.println("yes key is present");
        } else {
            System.out.println("not present");
        }
        //Write a Java program to create a set view of the mappings contained in a map.
        Set set = hashMap.entrySet();
        System.out.println("Set value" + set);

    }
}
