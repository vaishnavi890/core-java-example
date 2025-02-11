package com.vaishnavi.practice.innerClass.localInner.anotherExample.model;

public class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method that contains a Local Inner Class
    void bookDetails() {
        // Local Inner Class
        class Publisher {
            private String publisherName = "Penguin Books";

            void display() {
                System.out.println("Book Title: " + title);
                System.out.println("Author: " + author);
                System.out.println("Publisher: " + publisherName);
            }
        }

        // Creating an instance of the local inner class
        Publisher pub = new Publisher();
        pub.display();
    }
}

