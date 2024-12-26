package com.vaishnavi.practice.collections;

import java.util.ArrayList;

public class ListDemonstration {
    public static void main(String[] args) {
        String city = "Pune";
        String[] cities = new String[4];
        cities[0] = "pune";
        cities[1] = "mumbai";
        cities[2] = "latur";
        //String[] cities = {"pune", "mumbai", "delhi"};

        ArrayList cityList = new ArrayList();
        cityList.add("pune");
        cityList.add("mumbai");
        cityList.add("latur");
        cityList.add(100);
        cityList.add(true);
        cityList.add('a');
        cityList.add(103);
        cityList.add(8.2f);
        cityList.add(83872.27942842d);
        cityList.add(87376482462489223l);

        System.out.println("City: " + city);
        System.out.println("Cities[]: " + cities);
        System.out.println("ArrayList: " + cityList);

        ArrayList<String> cityGenericsList = new ArrayList<>();
        cityGenericsList.add("pune");
        cityGenericsList.add("mumbai");
        cityGenericsList.add("mumbai");
        cityGenericsList.add("latur");
        cityGenericsList.add("latur");
        System.out.println("ArrayList<String>: " + cityGenericsList);
    }
}

