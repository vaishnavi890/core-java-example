package com.vaishnavi.practice.java8Featues.collectionAPI;


public class Book {
        private String title;
        private String author;
        private double price;

        // Constructor
        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        // Display method
        public void display() {
            System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
        }
    }


