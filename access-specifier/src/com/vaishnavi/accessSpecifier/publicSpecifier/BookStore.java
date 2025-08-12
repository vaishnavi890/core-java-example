package com.vaishnavi.accessSpecifier.publicSpecifier;

public class BookStore {
    public static void main(String[] args) {
        Book b = new Book();
        b.title = "Effective Java";
        b.author = "Joshua Bloch";
        b.displayInfo(); // ✅ Works — public members accessible everywhere
    }
}

