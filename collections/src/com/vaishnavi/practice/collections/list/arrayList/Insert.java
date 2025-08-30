package com.vaishnavi.practice.collections.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Insert {
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

        colors.add(0, "Yellow");
        colors.add(5, "yyyyyyyyy");
        System.out.println("Colors is " + colors);
    }
}
