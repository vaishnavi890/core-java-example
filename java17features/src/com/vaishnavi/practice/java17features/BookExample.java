package com.vaishnavi.practice.java17features;

public class BookExample {
    public static void main(String[] args) {
        // Creating an array of books
        Book[] books = {
                new Book("Java Basics", "Vaishnavi", 299.0),
                new Book("Spring Boot", "Amit", 499.0),
                new Book("Data Structures", "Rahul", 399.0)
        };

        // Printing all book details
        for (Book b : books) {
            System.out.println("Title: " + b.title());
            System.out.println("Author: " + b.author());
            System.out.println("Price: ₹" + b.price());
            System.out.println("-----------------------");
        }
    }
}


