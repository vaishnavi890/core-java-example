package com.vaishnavi.ecommerce;

import com.vaishnavi.ecommerce.model.Review;
import com.vaishnavi.ecommerce.model.Product;
import com.vaishnavi.ecommerce.model.User;
import com.vaishnavi.ecommerce.service.ProductService;
import com.vaishnavi.ecommerce.service.ReviewService;
import com.vaishnavi.ecommerce.service.UserService;

public class ReviewSystemDemo {
    public static void main(String[] args) {
        System.out.println("E-Commerce Review System");

        UserService us = new UserService();
        User u = us.acceptUserData();

        ProductService ps = new ProductService();
        Product p = ps.acceptProductData();

        ReviewService rs = new ReviewService();
        Review r = rs.acceptReviewData();

        System.out.println("User details are " + u);
        System.out.println("product details are " + p);
        System.out.println("Review details are " + r);


    }
}

