package com.vaishnavi.ecommerce.service;

import com.vaishnavi.ecommerce.model.Product;
import java.util.Scanner;


public class ProductService {
    public Product acceptProductData() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the product id ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("enter the product name ");
        String name = sc.nextLine();
        System.out.println("enter the product price ");
        double price = sc.nextDouble();

        Product p = new Product();
        p.id = id;
        p.name = name;
        p.price = price;

        return p;


    }
}

