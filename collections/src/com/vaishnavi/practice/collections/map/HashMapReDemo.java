package com.vaishnavi.practice.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapReDemo {
    public static void main(String[] args) {
        Map<Integer, String> cityMap = new HashMap<>();
        Map<String, String> cities = new HashMap<>();
        cityMap.put(1, "Delhi");
        cityMap.put(2, "Mumbai");
        cityMap.put(3, "Delhi");
        cityMap.put(4, "Nagpur");
        cities.put("vaishnavi", "vaishnavi");
        System.out.println("Map " + cityMap);
        System.out.println("=========================================");
        System.out.println("cities " + cities);
    }
}
