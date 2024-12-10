package com.vaishnavi.ecommerce.service;

import com.vaishnavi.ecommerce.model.Review;

import java.util.Scanner;


public class ReviewService {
    public Review acceptReviewData() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the product id ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("enter the heading ");
        String heading = sc.nextLine();
        System.out.println("enter the description");
        String description = sc.nextLine();
        System.out.println("enter the rating ");
        String rating = sc.nextLine();

        Review r = new Review();
        r.id = id;
        r.description = description;
        r.heading = heading;
        r.rating = rating;

        return  r;

    }
}


