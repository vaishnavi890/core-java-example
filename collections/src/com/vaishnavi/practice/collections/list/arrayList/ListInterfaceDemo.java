package com.vaishnavi.practice.collections.list.arrayList;

import java.util.ArrayList;

public class ListInterfaceDemo {
    public static void main(String[] args) {
        ArrayList<Integer> value = new ArrayList<>();
        value.add(1);
        value.add(2);
        value.add(3);
        value.clone();
        value.indexOf(1);
        System.out.println(value);
    }
}
