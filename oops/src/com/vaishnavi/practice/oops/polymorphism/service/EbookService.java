package com.vaishnavi.practice.oops.polymorphism.service;

import com.vaishnavi.practice.oops.polymorphism.model.Book;

public class EbookService extends Book {
    String format;

    public EbookService(String title, String author, String format) {
        super(title, author);
        this.format = format;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Format: " + format);
    }
}

