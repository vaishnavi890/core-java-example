package com.vaishnavi.practice.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;

public class MapAllMethodsExample {
    public static void main(String[] args) {

        // Creating a HashMap
        Map<Integer, String> employees = new HashMap<>();

        // 1. put() → Add elements to the map
        employees.put(101, "Vaishnavi");
        employees.put(102, "Rohit");
        employees.put(103, "Sneha");
        employees.put(104, "Aniket");
        employees.put(105, "Priya");

        System.out.println("Initial Map: " + employees);

        // 2. putIfAbsent() → Add element only if key not present
        employees.putIfAbsent(106, "Sagar");
        employees.putIfAbsent(101, "Duplicate"); // Won't overwrite
        System.out.println("After putIfAbsent: " + employees);

        // 3. get() → Retrieve value by key
        System.out.println("Employee with ID 103: " + employees.get(103));

        // 4. getOrDefault() → Returns default if key not found
        System.out.println("Employee with ID 110: " + employees.getOrDefault(110, "Not Found"));

        // 5. containsKey() → Check if key exists
        System.out.println("Contains Key 104? " + employees.containsKey(104));

        // 6. containsValue() → Check if value exists
        System.out.println("Contains Value 'Sneha'? " + employees.containsValue("Sneha"));

        // 7. remove(key) → Remove entry by key
        employees.remove(105);
        System.out.println("After removing key 105: " + employees);

        // 8. remove(key, value) → Remove entry if key-value matches
        employees.remove(104, "Aniket");
        System.out.println("After removing key 104 with value: " + employees);

        // 9. replace(key, value) → Replace value for existing key
        employees.replace(102, "Raj");
        System.out.println("After replacing value for key 102: " + employees);

        // 10. replace(key, oldValue, newValue) → Replace only if old value matches
        employees.replace(103, "Sneha", "Sakshi");
        System.out.println("After conditional replace: " + employees);

        // 11. keySet() → Get all keys
        Set<Integer> keys = employees.keySet();
        System.out.println("All Keys: " + keys);

        // 12. values() → Get all values
        Collection<String> values = employees.values();
        System.out.println("All Values: " + values);

        // 13. entrySet() → Get all key-value pairs
        Set<Map.Entry<Integer, String>> entries = employees.entrySet();
        System.out.println("Entry Set: " + entries);

        // 14. Iterating using entrySet
        System.out.println("\nIterating using entrySet:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " → Name: " + entry.getValue());
        }

        // 15. Iterating using keySet and get()
        System.out.println("\nIterating using keySet:");
        for (Integer id : employees.keySet()) {
            System.out.println("ID: " + id + " → Name: " + employees.get(id));
        }

        // 16. Iterating using values() only
        System.out.println("\nIterating using values():");
        for (String name : employees.values()) {
            System.out.println("Name: " + name);
        }

        // 17. forEach() with lambda
        System.out.println("\nIterating using forEach and Lambda:");
        employees.forEach((id, name) -> System.out.println(id + " → " + name));

        // 18. size() → Get number of entries
        System.out.println("\nSize of Map: " + employees.size());

        // 19. isEmpty() → Check if map is empty
        System.out.println("Is Map Empty? " + employees.isEmpty());

        // 20. clear() → Remove all entries
        employees.clear();
        System.out.println("\nAfter clear(), Map: " + employees);
        System.out.println("Is Map Empty Now? " + employees.isEmpty());
    }
}

