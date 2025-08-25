package com.vaishnavi.loop.pattern.whileLoop;

public class WhileLoopPattern {
    //expected output
    //*
    //**
    //***
    //****
    //*****
    public static void main(String[] args) {
//        int rowNo = 0;
//        while (rowNo <= 5) {
//            System.out.println(rowNo);
//
//            int index = 0;
//
//            while (index <= rowNo) {
//                System.out.print(index + " \t");
//                index++;
//            }
//            rowNo++;
//        }

        int row = 0;
        while (row <= 5) {
            System.out.println(row);

            int index = 0;
            while (index <= row) {
                System.out.print(index + " \t");
                index++;
            }
            row++;
        }
    }
}
