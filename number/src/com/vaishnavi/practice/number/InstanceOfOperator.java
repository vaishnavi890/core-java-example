package com.vaishnavi.practice.number;

public class InstanceOfOperator {
    public static void main(String[] args) {
        String city = "Pune";
        Integer length = 20;
        Double temp = 13.67;

        if (city instanceof String) {
            System.out.println("type of city is string");
        } else {
            System.out.println("type of city is not string");
        }

        if (length instanceof Integer) {
            System.out.println("type of length is interger");
        } else {
            System.out.println("type of length is not interger");
        }
        if (temp instanceof Double) {
            System.out.println("type of temp is string");
        } else {
            System.out.println("type of temp is not string");
        }
    }
}

