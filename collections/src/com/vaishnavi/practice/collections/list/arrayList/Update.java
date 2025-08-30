package com.vaishnavi.practice.collections.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Update {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Orange");
        colors.add("Red");
        colors.add("Pink");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Purple");

        System.out.println("Colors is " + colors);
        System.out.println(colors.set(1, "Black"));
        System.out.println("updated list " + colors);
    }
}
