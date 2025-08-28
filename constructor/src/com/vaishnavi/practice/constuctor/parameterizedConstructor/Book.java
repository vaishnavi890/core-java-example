package com.vaishnavi.practice.constuctor.parameterizedConstructor;

public class Book {
        int bookId;
        String title;
        String author;
        double price;

        // Parameterized Constructor
        Book(int bookId, String title, String author, double price) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
            this.price = price;
        }

        // Method to display book details
        void displayBookDetails() {
            System.out.println("Book ID: " + bookId);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: ₹" + price);
            System.out.println("----------------------------------");
        }

        public static void main(String[] args) {
            // Creating objects using parameterized constructor
            Book b1 = new Book(101, "Java Programming", "James Gosling", 550.0);
            Book b2 = new Book(102, "Data Structures", "Robert Lafore", 650.0);
            Book b3 = new Book(103, "Operating System", "Abraham Silberschatz", 700.0);

            // Displaying book details
            b1.displayBookDetails();
            b2.displayBookDetails();
            b3.displayBookDetails();
        }
    }

