package com.vaishnavi.practice.collections.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUnderstandDemo {
    public static void main(String[] args) {
        List<Integer> marksList = new ArrayList<>();

        marksList.add(90);
        marksList.add(99);
        marksList.add(90);
        marksList.add(90);
        marksList.add(98);
        marksList.add(40);
        marksList.add(60);
        System.out.println("marks is " + marksList);

        List<String> flowerList = new ArrayList<>();

        flowerList.add("lotus");
        flowerList.add("rose");
        flowerList.add("sunflower");
        flowerList.add("iris");
        flowerList.add("bell");
        flowerList.add("marigold");

        System.out.println("flowers is " + flowerList);

        System.out.println("flower present by 0th position  " + flowerList.get(0));

        String removeflowerList = flowerList.remove(0);
        System.out.println("remove flower" + removeflowerList);
        System.out.println("flowers list is " + flowerList);

        List<String> newFlowerList = new ArrayList<>();
        newFlowerList.addAll(flowerList);
        newFlowerList.add("tulip");
        System.out.println("new flower list " + newFlowerList);

//        Iterator<String> flowersIterator = newFlowerList.listIterator();
//        while (flowersIterator.hasNext()){
////            System.out.println("previous element in newFlowerList using flowerIterator " + flowersIterator.hasNext());
//        }

        System.out.println("for each loop");
        for (String flower : newFlowerList) {
            System.out.println("flowers list is " + flower);
        }

//        toArray() convert list into array
        String[] flowerArray = newFlowerList.toArray(new String[newFlowerList.size()]);
        for (String flower : flowerArray) {
            System.out.println("Convert array " + flower);
        }

        System.out.println(flowerList);
        System.out.println(newFlowerList.removeAll(flowerList));
        System.out.println("after" + newFlowerList);

        //clear()
        System.out.println("size of newflowerlist clear() " + flowerList.size());
        flowerList.clear();
        System.out.println("size of newflowerlist after clear() " + flowerList.size());

    }
}
