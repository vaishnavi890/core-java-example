package com.vaishnavi.practice.stream.anotherExample;

public class Book {
    private int id;
    private String title;
    private String author;
    private int pages;

    public Book(int id, String title, String author, int pages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPages() { return pages; }
}
