package com.vaishnavi.practice.serializationDeserialization.another;

import java.io.Serializable;

public class Laptop implements Serializable {
    private static final long serialVersionUID = 1L;

    private String brand;
    private String model;
    private double price;
    private transient String password;  // transient: won't be serialized

    public Laptop(String brand, String model, double price, String password) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", password='" + password + '\'' +
                '}';
    }
}

