package com.vaishnavi.book.inventory.model;

public class BookInfo {
    public int bookID;
    public String Name;
    public String author;
    public String publication;
    public String language;
    public String category;

    @Override
    public String toString() {
        return "InventoryInfo{" +
                "bookID=" + bookID +
                ", Name='" + Name + '\'' +
                ", author='" + author + '\'' +
                ", publication='" + publication + '\'' +
                ", language='" + language + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}

