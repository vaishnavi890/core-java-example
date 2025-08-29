package com.vaishnavi.practice.collections.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Orange");
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("Brown");
        colors.add("Pink");
        colors.add("Purple");

        System.out.println("Colors is " + colors);
        System.out.println(colors.remove(2));
        System.out.println("Colors is " + colors);

        //Write a Java program to search for an element in an array list.
        if (colors.contains("Red")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
        System.out.println(colors.contains("Pink") ? "Found the element" : "There is no such element");
        System.out.println("=========================================================");
        //Write a Java program to sort a given array list.
        Collections.sort(colors);
        System.out.println("sorted list " + colors);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println("element at " + i + ":" + colors.get(i));
            System.out.println("=========================================================");
            //Write a Java program to replace the second element of an ArrayList with the specified element.
            String newElement = "ryghgehgj";
            String result = (colors.size() > 1)
                    ? (colors.set(1, newElement) != null ? "replace" : "not")
                    : "ArrayList does not have a second element to replace.";
            System.out.println("new" + colors);
        }
        System.out.println("=========================================================");
        //Write a Java program to sort a given array list.
        System.out.println("before sorting " + colors);
        Collections.sort(colors);
        System.out.println("after sorting " + colors);
        System.out.println("=========================================================");
        //Write a Java program to copy one array list into another.
        List<String> copyList = new ArrayList<>();
        copyList.addAll(colors);
        System.out.println("Original list " + colors);
        System.out.println("Copy list " + copyList);
        System.out.println("=========================================================");
        //Write a Java program to shuffle elements in an array list.
        System.out.println("original array " + colors);
        Collections.shuffle(colors);
        System.out.println("shuffle array" + colors);
        System.out.println("=========================================================");
        // Write a Java program to reverse elements in an array list.
        System.out.println("original array " + colors);
        Collections.reverse(colors);
        System.out.println("reverse array " + colors);

        System.out.println("=========================================================");

        //Write a Java program to extract a portion of an array list.
        System.out.println("original array " + colors);
        List<String> sub_list = colors.subList(5, 6);
        System.out.println("extracting list is" + sub_list);

        System.out.println("=========================================================");

        //Write a Java program to compare two array lists.
        List<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        c2.add("Brown");
        List<String> c3 = new ArrayList<String>();
        for (String array : colors) {
            c3.add(c2.contains(array) ? "Yes " : "No");
            System.out.println(c3);
        }
        System.out.println("=========================================================");
        //Write a Java program that swaps two elements in an array list.
        System.out.println("array before swap" + colors);
        Collections.swap(colors, 2, 4);
        System.out.println("After swap " + colors);
        System.out.println("=========================================================");
        // Write a Java program to join two array lists.
        System.out.println("before the join " + c3);
        c3.addAll(colors);
        c3.addAll(c2);
        System.out.println("After the join " + c3);

        System.out.println("=========================================================");
        //Write a Java program to clone an array list to another array list.
        System.out.println("original" + colors);
        // ArrayList<String> clonedList = (ArrayList<String>) colors.clone();

        System.out.println("=========================================================");
        //Write a Java program to empty an array list.
        System.out.println("original " + c2);
        c2.removeAll(c2);
        System.out.println("after " + c2);

        System.out.println("=========================================================");
        //Write a Java program to test whether an array list is empty or not.
        System.out.println("check" + c2.isEmpty());

        System.out.println("=========================================================");
        //colors.trimToSize();

        System.out.println("=========================================================");

        //Write a Java program to increase an array list size.

        System.out.println("=========================================================");
//        System.out.println("original " + c2);
//        colors.ensureCapacity(6);
//        c1.add("White");
//        c1.add("Pink");
//        c1.add("Yellow");
//        System.out.println("New array list: " + c1);

        System.out.println("=========================================================");
        //Write a Java program to extract a portion of an array list.
        System.out.println("original list is " + colors);
        List<String> list = colors.subList(2, 3);
        System.out.println("list is " + list);
        System.out.println("=========================================================");

        ArrayList<String> list1 = new ArrayList<>();
        for (String a : colors) {
            c3.add(c2.contains(a) ? "yes" : "No");
            System.out.println(c3);
        }
        System.out.println("=========================================================");
        //Write a Java program for trimming the capacity of an array list.
        System.out.println(colors);
        colors.trimToSize();
        System.out.println(colors);

        System.out.println("=========================================================");
        //Write a Java program to increase an array list size.
        System.out.println("original array list is " + colors);
        colors.add("pinkpink");
        System.out.println("after" + colors);

        System.out.println("=========================================================");
        //Write a Java program to replace the second element of an ArrayList with the specified element.
        System.out.println("Original array list: " + colors);
        String new_color = "redredredred";
        colors.set(0, new_color);
        int num = colors.size();
        System.out.println("Replace second element with 'White'.");
        for (int i = 0; i < num; i++)
            System.out.println(colors.get(i));

        System.out.println("=========================================================");
        //Write a Java program to print all the elements of an ArrayList using the elements' position.
        System.out.println(colors);
        int no = colors.size();
        System.out.println(no);
        for (int i = 0; i < no; i++) {
            System.out.println(colors.get(i));
        }
    }
}
