package com.vaishnavi.loop.pattern.doWhileLoop;

public class SequenceDemo {
    public static void main(String[] args) {
        //pseudocode
        //initialize no = 0
        //increment no
        //write statement to print no
        //add above code to loop
        System.out.println("output for while loop");
        int no = 0;
        while (no <= 10) {
            System.out.println("no = " + no);
            no++;
        }
        no = 0;
        System.out.println("output for do while loop");
        do {
            System.out.println("no = " + no);
            no++;
        } while (no <= 10);
    }
}
