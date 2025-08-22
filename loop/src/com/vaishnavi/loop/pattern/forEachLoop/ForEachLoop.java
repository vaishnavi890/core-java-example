package com.vaishnavi.loop.pattern.forEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 5, 6, 9};
        //old fashion code
//        int[] array = new int[5];
//        array[0] = 20;
//        array[1] = 40;
//        array[2] = 44;
//        array[3] = 23;
//        array[4] = 89;

        int index = 0;
        System.out.println("print array using while loop ");
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("print array using for loop ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("print array using for-each loop ");
        for (int k : array) {
            System.out.println(k);
        }
    }
}
