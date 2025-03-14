package com.vaishnavi.practice.collections;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Creating list using the ArrayList class
        List<String> cities = new ArrayList<>();

        // add() - Add elements to the list
        cities.add("Pune"); // index = 0
        cities.add("Mumbai"); // index = 1
        cities.add("Latur"); // index = 2
        System.out.println("List: " + cities);
        System.out.println("-----------------------------");

        //get() - helps to randomly access elements from lists
        String mumbaiCity = cities.get(1);
        System.out.println("Accessed Element: " + mumbaiCity);
        System.out.println("-----------------------------");

        //remove() - removes an element from the list
        String removedCity = cities.remove(1);
        System.out.println("Removed Element: " + removedCity);
        System.out.println("Remaining List: " + cities);
        System.out.println("-----------------------------");

        List<String> newCitiesList = new ArrayList<>();
        //addAll() - adds all elements of one list to another
        boolean isOldListAdded = Collections.addAll(cities, "Chennai", "Jaipur", "Kolkata");
        System.out.println("Old list is " + (isOldListAdded ? "" : "NOT ") + "updated with new cities");
        System.out.println("old Cities List: " + cities);

        newCitiesList.addAll(cities);

        newCitiesList.add("Bengaluru");
        System.out.println("New Cities List: " + newCitiesList);
        System.out.println("-----------------------------");

        //contains() - returns true if a list contains specified element
        if (newCitiesList.contains(2)) {
            System.out.println(2 + " value is present in newCitiesList");
        }

        if (newCitiesList.contains("Bengaluru")) {
            System.out.println("\"Bengaluru\" value is present in newCitiesList");
        }
        System.out.println("-----------------------------");

        //size() - returns the length of lists
        System.out.println("Size of newCitiesList: " + newCitiesList.size());
        System.out.println("-----------------------------");

        //iterator() - returns iterator object that can be used to sequentially access elements of lists
        Iterator<String> citiesIterator = newCitiesList.iterator();
        while (citiesIterator.hasNext()) {
            System.out.println("next element in newCitiesList: " + citiesIterator.next());
        }
        System.out.println("-----------------------------");

        //listIterator() - returns iterator object that can be used to sequentially access elements of lists
        ListIterator<String> citiesListIterator = newCitiesList.listIterator();
        while (citiesListIterator.hasNext()) {
            System.out.println("next element in newCitiesList using citiesListIterator: " + citiesListIterator.next());
        }
        System.out.println("-----------------------------");
        while (citiesListIterator.hasPrevious()) {
            System.out.println("previous element in newCitiesList using citiesListIterator: " + citiesListIterator.previous());
        }
        System.out.println("-----------------------------");

        // for each loop example
        System.out.println("Using for each loop:");
        for (String city : newCitiesList) {
            System.out.println("next city: " + city);
        }
        System.out.println("-----------------------------");

        //toArray() - converts a list into an array
        //String[] citiesArray = newCitiesList.toArray(String[]::new);
        String[] citiesArray = newCitiesList.toArray(new String[newCitiesList.size()]);
        for(String city : citiesArray) {
            System.out.println("Conversion to Array: " + city);
        }
        System.out.println("-----------------------------");

        //removeAll() - removes all the elements from the list
        System.out.println("Before removal - Cities List: " + cities);
        System.out.println("Before removal - New Cities List: " + newCitiesList);
        System.out.println("removed all elements of cities list from newCitiesList: " + newCitiesList.removeAll(cities));
        System.out.println("After removal - Remaining New Cities List: " + newCitiesList);
        System.out.println("-----------------------------");

        //clear() - removes all the elements from the list (more efficient than removeAll())
        System.out.println("Size of newCitiesList before clear(): " + newCitiesList.size());
        newCitiesList.clear();
        System.out.println("Size of newCitiesList after clear(): " + newCitiesList.size());
    }
}

