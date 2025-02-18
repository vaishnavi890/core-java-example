package com.vaishnavi.practice.java8Featues.collectionAPI;

import java.util.List;
import java.util.Set;

public class BookCollectionExample {
        public static void main(String[] args) {
            // Creating an immutable list of books
            List<Book> bookList = List.of(
                    new Book("The Alchemist", "Paulo Coelho", 10.99),
                    new Book("Atomic Habits", "James Clear", 15.99),
                    new Book("Clean Code", "Robert C. Martin", 30.99)
            );

            // Creating an immutable set of book titles
            Set<String> bookTitles = Set.of(
                    "The Alchemist",
                    "Atomic Habits",
                    "Clean Code"
            );

            // Display books from the list
            System.out.println("Book List:");
            for (Book book : bookList) {
                book.display();
            }

            // Display book titles from the set
            System.out.println("\nBook Titles:");
            for (String title : bookTitles) {
                System.out.println(title);
            }

            // Trying to modify the collection (this will throw UnsupportedOperationException)
            // bookList.add(new Book("New Book", "Unknown Author", 20.00)); // ERROR
            // bookTitles.add("New Book"); // ERROR
        }
    }
