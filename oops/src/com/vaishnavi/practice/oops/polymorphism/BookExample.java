package com.vaishnavi.practice.oops.polymorphism;

import com.vaishnavi.practice.oops.polymorphism.service.AudioBookService;
import com.vaishnavi.practice.oops.polymorphism.service.EbookService;
import com.vaishnavi.practice.oops.polymorphism.model.Book;

public class BookExample {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien");
        EbookService eBook = new EbookService("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", "PDF");
        AudioBookService audioBook = new AudioBookService("Sapiens", "Yuval Noah Harari", 15.5);

        book.displayInfo();
        System.out.println();
        eBook.displayInfo();
        System.out.println();
        audioBook.displayInfo();
    }
}

