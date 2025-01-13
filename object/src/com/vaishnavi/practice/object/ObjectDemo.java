package com.vaishnavi.practice.object;

public class ObjectDemo {
    public static void main(String[] args) {
        Object objectDoubleValue = 4643.6548;
        //object = new Student();
        // auto-boxing
        double doubleValue = (double)objectDoubleValue;
        Double secondDoubleValue = 233424.34;

        // unboxing
        System.out.println("Object: " + doubleValue);
    }

    static class Student {
        int roll;
        String name;
    }
}

