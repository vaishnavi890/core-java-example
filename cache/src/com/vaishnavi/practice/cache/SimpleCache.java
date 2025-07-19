package com.vaishnavi.practice.cache;

import java.util.HashMap;
import java.util.Map;

public class SimpleCache {
    private final Map<Integer, String> cache = new HashMap<>();

    public static void main(String[] args) {
        SimpleCache cache = new SimpleCache();

        System.out.println(cache.getStudent(1)); // Fetches from DB
        System.out.println(cache.getStudent(1)); // Fetches from cache
        System.out.println(cache.getStudent(2)); // Fetches from DB
        System.out.println(cache.getStudent(2)); // Fetches from cache
    }

    // Simulated expensive DB call
    private String getFromDatabase(int id) {
        System.out.println("Fetching from DB for id: " + id);
        return "Student-" + id;
    }

    public String getStudent(int id) {
        if (cache.containsKey(id)) {
            System.out.println("Returning from Cache for id: " + id);
            return cache.get(id);
        }

        String student = getFromDatabase(id); // Expensive operation
        cache.put(id, student); // Store in cache
        return student;
    }
}

