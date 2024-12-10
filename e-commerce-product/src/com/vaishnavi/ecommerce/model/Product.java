package com.vaishnavi.ecommerce.model;

public class Product {
    public int id;
    public String name;
    public double price;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
