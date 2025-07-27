package com.vaishnavi.practice.serializationDeserialization.another;

import java.io.Serializable;

public class Food implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String category;
    private double price;
    private boolean isVeg;

    public Food(String name, String category, double price, boolean isVeg) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.isVeg = isVeg;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", isVeg=" + isVeg +
                '}';
    }
}

