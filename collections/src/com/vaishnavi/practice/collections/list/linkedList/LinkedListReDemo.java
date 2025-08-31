package com.vaishnavi.practice.collections.list.linkedList;

import java.util.LinkedList;
import java.util.List;


public class LinkedListReDemo {
    public static void main(String[] args) {
        List<String> flowers = new LinkedList<>();
        System.out.println("size of list is " + flowers.size());

        if (flowers.isEmpty()) {
            flowers.addAll(List.of("rose", "lotus"));
        } else {
            System.out.println("list is not empty");
        }
        System.out.println("now list " + flowers);
    }
}
