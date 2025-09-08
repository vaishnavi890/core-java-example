package com.vaishnavi.practice.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class LinkedHashMapAllMethodsExample {
    public static void main(String[] args) {

        // Creating a LinkedHashMap (preserves insertion order)
        LinkedHashMap<Integer, String> courses = new LinkedHashMap<>();

        // 1. put() → Add elements
        courses.put(1, "Java");
        courses.put(2, "Python");
        courses.put(3, "C++");
        courses.put(4, "JavaScript");
        courses.put(5, "SQL");

        System.out.println("Initial LinkedHashMap: " + courses);

        // 2. putIfAbsent()
        courses.putIfAbsent(6, "Spring Boot");
        courses.putIfAbsent(2, "Duplicate"); // Won’t overwrite
        System.out.println("After putIfAbsent: " + courses);

        // 3. get(), getOrDefault()
        System.out.println("Course ID 3: " + courses.get(3));
        System.out.println("Course ID 10: " + courses.getOrDefault(10, "Not Available"));

        // 4. containsKey(), containsValue()
        System.out.println("Contains Key 4? " + courses.containsKey(4));
        System.out.println("Contains Value 'Java'? " + courses.containsValue("Java"));

        // 5. remove(key), remove(key, value)
        courses.remove(5);
        courses.remove(3, "C++");
        System.out.println("After removing SQL and C++: " + courses);

        // 6. replace methods
        courses.replace(1, "Java", "Advanced Java");
        courses.replace(4, "JavaScript");
        System.out.println("After replace operations: " + courses);

        // 7. keySet(), values(), entrySet()
        Set<Integer> keys = courses.keySet();
        Collection<String> values = courses.values();
        Set<Map.Entry<Integer, String>> entries = courses.entrySet();
        System.out.println("Keys: " + keys);
        System.out.println("Values: " + values);
        System.out.println("Entries: " + entries);

        // 8. Iterating using forEach and Lambda
        System.out.println("\nIterating LinkedHashMap:");
        courses.forEach((id, name) -> System.out.println("ID: " + id + " → Course: " + name));

        // 9. size(), isEmpty()
        System.out.println("\nSize: " + courses.size());
        System.out.println("Is LinkedHashMap Empty? " + courses.isEmpty());

        // 10. clear()
        courses.clear();
        System.out.println("After clear(), LinkedHashMap: " + courses);
        System.out.println("Is Empty Now? " + courses.isEmpty());
    }
}


