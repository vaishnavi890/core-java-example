package com.vaishnavi.practice.collections.list.arrayList;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> integerList = new CopyOnWriteArrayList<>();
        integerList.addAll(List.of(1, 4, 2, 6, 875, 6, 45, 4545, 4545, 45, 667, 7));

        Iterator<Integer> integerIterator = integerList.iterator();

        while (integerIterator.hasNext()) {
            int element = integerIterator.next();
            System.out.println("Current element " + element);

            if (element % 2 == 0) {
                integerList.add(element + 10000);
            }
        }
        System.out.println("At the end the array is " + integerList);

    }
}
