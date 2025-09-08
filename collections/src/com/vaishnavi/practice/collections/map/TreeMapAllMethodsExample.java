package com.vaishnavi.practice.collections.map;

import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Collection;

public class TreeMapAllMethodsExample {
    public static void main(String[] args) {

        // Creating a TreeMap (keys will be sorted)
        TreeMap<Integer, String> students = new TreeMap<>();

        // 1. put() → Add entries
        students.put(105, "Priya");
        students.put(101, "Vaishnavi");
        students.put(103, "Rohit");
        students.put(104, "Sneha");
        students.put(102, "Aniket");

        System.out.println("Initial TreeMap: " + students);

        // 2. putIfAbsent() → Add entry only if key not present
        students.putIfAbsent(106, "Sagar");
        students.putIfAbsent(103, "Duplicate"); // Won't overwrite
        System.out.println("After putIfAbsent: " + students);

        // 3. get() → Get value by key
        System.out.println("Student with ID 103: " + students.get(103));

        // 4. getOrDefault() → Return default if key not found
        System.out.println("Student with ID 110: " + students.getOrDefault(110, "Not Found"));

        // 5. containsKey() & containsValue()
        System.out.println("Contains Key 104? " + students.containsKey(104));
        System.out.println("Contains Value 'Sneha'? " + students.containsValue("Sneha"));

        // 6. firstKey(), lastKey()
        System.out.println("First Key: " + students.firstKey());
        System.out.println("Last Key: " + students.lastKey());

        // 7. higherKey(), lowerKey()
        System.out.println("Higher Key than 103: " + students.higherKey(103));
        System.out.println("Lower Key than 103: " + students.lowerKey(103));

        // 8. ceilingKey(), floorKey()
        System.out.println("Ceiling Key for 104: " + students.ceilingKey(104));
        System.out.println("Floor Key for 104: " + students.floorKey(104));

        // 9. remove(key) and remove(key, value)
        students.remove(105);
        students.remove(104, "Sneha");
        System.out.println("After removing 105 & 104: " + students);

        // 10. replace() methods
        students.replace(102, "Aniket", "Amit");
        students.replace(101, "Vaishnavi");
        System.out.println("After replace operations: " + students);

        // 11. keySet(), values(), entrySet()
        Set<Integer> keys = students.keySet();
        Collection<String> values = students.values();
        Set<Map.Entry<Integer, String>> entries = students.entrySet();
        System.out.println("Keys: " + keys);
        System.out.println("Values: " + values);
        System.out.println("Entries: " + entries);

        // 12. Iterating using forEach and Lambda
        System.out.println("\nIterating TreeMap:");
        students.forEach((id, name) -> System.out.println(id + " → " + name));

        // 13. size(), isEmpty()
        System.out.println("\nSize of TreeMap: " + students.size());
        System.out.println("Is TreeMap Empty? " + students.isEmpty());

        // 14. clear()
        students.clear();
        System.out.println("After clear(), TreeMap: " + students);
        System.out.println("Is Empty Now? " + students.isEmpty());
    }
}

