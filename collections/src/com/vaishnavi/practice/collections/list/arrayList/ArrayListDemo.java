package com.vaishnavi.practice.collections.list.arrayList;

import java.util.*;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        //creating list using arraylist class.
        List<String> cities = new ArrayList<>();

        //add element to the array.
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");
        // cities.remove(0);
        System.out.println("List " + cities);
        System.out.println("----------------------------------------");

        //get() - helps to randomly access elements from lists
        String mumbaiCity = cities.get(1);
        System.out.println("Accessed Element " + mumbaiCity);
        String puneCity = cities.get(0);
        System.out.println("Accessed Element " + puneCity);
        System.out.println("----------------------------------------");

        //remove() - removes an element from the list.
        String removeCity = cities.remove(1);
        System.out.println("Remove element " + removeCity);
        System.out.println("Remaining list " + cities);
        System.out.println("----------------------------------------");

        List<String> newCitiList = new ArrayList<>();
        //addAll() - adds all elements of one list to another
        boolean oldlist = Collections.addAll(cities, "Goa", "Gujrat", "Surat", "KolKata");
        System.out.println("old list is " + (oldlist ? "" : "NOT ") + "Updated with new cities");
        System.out.println("old cities list " + cities);

        newCitiList.addAll(cities);

        newCitiList.add("Bengaluru");
        System.out.println("New city list " + newCitiList);
        System.out.println("----------------------------------------");

        //contains() - returns true if a list contains specified element
        if (newCitiList.contains(2)) {
            System.out.println(2 + " value is present in newCitiesList");
        }

        if (newCitiList.contains("Bengaluru")) {
            System.out.println("\"Bengaluru\" value is present in newCitiesList");
        }
        System.out.println("-----------------------------");

        //size() - returns the length of lists
        System.out.println("Size of newCitiesList: " + newCitiList.size());
        System.out.println("-----------------------------");

        //iterator() - returns iterator object that can be used to sequentially access elements of lists
        Iterator<String> citiesIterator = newCitiList.iterator();
        while (citiesIterator.hasNext()) {
            System.out.println("next element in newCitiesList: " + citiesIterator.next());
        }
        System.out.println("-----------------------------");

        //listIterator() - returns iterator object that can be used to sequentially access elements of lists
        ListIterator<String> citiesListIterator = newCitiList.listIterator();
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
        for (String city : newCitiList) {
            System.out.println("next city: " + city);
        }
        System.out.println("-----------------------------");

        //toArray() - converts a list into an array
        //String[] citiesArray = newCitiesList.toArray(String[]::new);
        String[] citiesArray = newCitiList.toArray(new String[0]);
        for (String city : citiesArray) {
            System.out.println("Conversion to Array: " + city);
        }
        System.out.println("-----------------------------");

        //removeAll() - removes all the elements from the list
        System.out.println("Before removal - Cities List: " + cities);
        System.out.println("Before removal - New Cities List: " + newCitiList);
        System.out.println("removed all elements of cities list from newCitiesList: " + newCitiList.removeAll(cities));
        System.out.println("After removal - Remaining New Cities List: " + newCitiList);
        System.out.println("-----------------------------");

        //clear() - removes all the elements from the list (more efficient than removeAll())
        System.out.println("Size of newCitiesList before clear(): " + newCitiList.size());
        newCitiList.clear();
        System.out.println("Size of newCitiesList after clear(): " + newCitiList.size());
    }
}
