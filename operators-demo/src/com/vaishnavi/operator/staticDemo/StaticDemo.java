package com.vaishnavi.operator.staticDemo;

public class StaticDemo {
    int no;

    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();
        staticDemo.no = 40;
        staticDemo.printNo();

        City.printCity();
    }

    public void printNo() {
        System.out.println("Currently no's value = " + no);
    }
}
