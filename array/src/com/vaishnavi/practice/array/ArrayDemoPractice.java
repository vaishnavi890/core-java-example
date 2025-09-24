package com.vaishnavi.practice.array;

public class ArrayDemoPractice {
    public static void main(String[] args) {
        int[] marks = new int[7];

        System.out.println("Size of array is: " + marks.length);
        //while loop...................................
        System.out.println("-----------while loop-----------");
        int position = 0;
        System.out.println("Demo of while loop:");
        while (position < marks.length) {
            System.out.println(marks[position]);
            position++;
        }
        //for loop..
        System.out.println("------------------for loop----------------------");
        System.out.println("demo of for loop");
        for (int index = 0; index < marks.length; index++) {
            System.out.println(marks[index]);
        }
        //for each loop
        System.out.println("--------------for each loop--------------");
        System.out.println("demo of for-each-loop");
        for (int element : marks) {
            System.out.println(element);
        }

        //do while
//        do{
//
//        }while ();

    }
}
