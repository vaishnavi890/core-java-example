package com.vaishnavi.practice.garbageCollector;

public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Reading book: " + title);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics");
        Book b2 = new Book("Advanced Java");

        b1.display();
        b2.display();

        // b1 and b2 are no longer needed
        b1 = null;
        b2 = null;

        // Requesting JVM for garbage collection
        System.gc();

        System.out.println("Main method completed. Objects are eligible for GC.");
    }
}


