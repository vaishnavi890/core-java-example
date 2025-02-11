package com.vaishnavi.practice.breakContinue.continueExample;

import com.vaishnavi.practice.breakContinue.continueExample.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookExample {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Harry Potter", "J.K. Rowling"));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien"));
        books.add(new Book("Fifty Shades of Grey", "E.L. James"));
        books.add(new Book("Percy Jackson", "Rick Riordan"));
        books.add(new Book("Sherlock Holmes", "Arthur Conan Doyle"));

        System.out.println("Printing book list, skipping 'Fifty Shades of Grey'...");

        for (Book book : books) {
            if (book.getTitle().equals("Fifty Shades of Grey")) {
                System.out.println("Skipping restricted book: " + book.getTitle());
                continue; // Skips the current iteration and moves to the next book
            }
            System.out.println("Book: " + book.getTitle() + " by " + book.getAuthor());
        }

        System.out.println("Finished printing books.");
    }
}

