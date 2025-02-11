package com.vaishnavi.practice.innerClass.localInner.anotherExample.model;

public class BookExample {
    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch");
        book.bookDetails(); // Calling the method containing the local inner class
    }
}
