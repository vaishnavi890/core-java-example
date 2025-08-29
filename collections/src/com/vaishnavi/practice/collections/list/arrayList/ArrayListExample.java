package com.vaishnavi.practice.collections.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        //add() method
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Amt");
        cities.add("Dadar");

        System.out.println("Cities List is " + cities);
        System.out.println("--------------------------------------");
        //get() method
        String mumbaiCity = cities.get(1);
        System.out.println("Accessed Element " + mumbaiCity);
        System.out.println("--------------------------------------");

        //remove () method
        String removedCity = cities.remove(1);
        System.out.println("Removed Element " + removedCity);
        System.out.println("Remaining  cities " + cities);
        System.out.println("--------------------------------------");

    }
}
