package com.vaishnavi.practice.oops.polymorphism.service;

import com.vaishnavi.practice.oops.polymorphism.model.Book;

public class AudioBookService extends Book {
    double duration;

    public AudioBookService(String title, String author, double duration) {
        super(title, author);
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Duration: " + duration + " hours");
    }
}

