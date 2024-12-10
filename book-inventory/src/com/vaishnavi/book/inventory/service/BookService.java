package com.vaishnavi.book.inventory.service;

import com.vaishnavi.book.inventory.model.BookInfo;
import java.util.Scanner;

public class BookService {
    public BookInfo acceptingBookInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter book Name");
        String name = scanner.nextLine();

        System.out.println("Enter book Author");
        String author = scanner.nextLine();

        System.out.println("Enter book Publication");
        String publication = scanner.nextLine();

        System.out.println("Enter book language");
        String language = scanner.nextLine();

        System.out.println("Enter book category");
        String category = scanner.nextLine();

        // initialize entities
        BookInfo book = new BookInfo();
        book.bookID = id;
        book.Name = name;
        book.author = author;
        book.publication = publication;
        book.language = language;
        book.category = category;

        return book;
    }
}

