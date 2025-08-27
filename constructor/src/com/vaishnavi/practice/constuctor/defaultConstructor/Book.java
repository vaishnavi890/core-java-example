package com.vaishnavi.practice.constuctor.defaultConstructor;

public class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Not Available";
        price = 0.0;
        System.out.println("Book object created using Default Constructor");
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}
