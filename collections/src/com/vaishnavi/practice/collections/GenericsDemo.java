package com.vaishnavi.practice.collections;

import java.util.ArrayList;

public class GenericsDemo {
    //generics are used for
    public static void main(String[] args) {
        ArrayList<String> cityGenericsList = new ArrayList<>();//generics is used for datatype validation.
        cityGenericsList.add("pune");
        cityGenericsList.add("mumbai");
        cityGenericsList.add("delhi");
        cityGenericsList.add("amravati");
        cityGenericsList.add("amravati");
        cityGenericsList.add("amravati");
        //cityGenericsList.add(true);
        System.out.println("ArrayList <String> " + cityGenericsList);

        ArrayList<Integer> value = new ArrayList<>();
        value.add(3);
        value.add(665555);
        value.add(456789);
        System.out.println("ArrayList <Int>" + value);
        System.out.println("end");

        ArrayList city = new ArrayList();
        city.add(1);
        city.add("pune");
        System.out.println("ArrayList " + city);
    }
}
