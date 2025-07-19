package com.vaishnavi.practice.cache;

import java.util.HashMap;
import java.util.Map;

public class CacheDemo {

    private final Map<String, String> cache = new HashMap<>();

    public static void main(String[] args) {
        CacheDemo cache = new CacheDemo();
        System.out.println(cache.getData("user1")); // Fetch and cache
        System.out.println(cache.getData("user1")); // Return cached
        System.out.println(cache.getData("user2")); // Fetch and cache
    }

    // Simulate fetching data (e.g., from database or network)
    private String fetchData(String key) {
        System.out.println("Fetching data for " + key);
        return "Data for " + key;
    }

    public String getData(String key) {
        // Check if data is already in cache
        if (cache.containsKey(key)) {
            System.out.println("Returning cached data for " + key);
            return cache.get(key);
        }
        // If not in cache, fetch and store in cache
        String data = fetchData(key);
        cache.put(key, data);
        return data;
    }
}
