package com.vaishnavi.loop.pattern.forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<String> str = new ArrayList<>();
        str.add("shreya");

        for (String s : str) {
            System.out.println(s);
        }

    }
}
