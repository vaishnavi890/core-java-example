package com.vaishnavi.practice.staticClass.staticInner;

public class Library {
    // Outer static nested class
    static class BookCategory {

        String categoryName;

        BookCategory(String categoryName) {
            this.categoryName = categoryName;
        }

        void showCategory() {
            System.out.println("Category: " + categoryName);
        }

        // ✅ Static class inside static nested class
        static class Book {
            String title;
            String author;

            Book(String title, String author) {
                this.title = title;
                this.author = author;
            }

            void displayBook() {
                System.out.println("Book Title: " + title);
                System.out.println("Author: " + author);
            }
        }
    }

    public static void main(String[] args) {
        // Create object of outer static nested class
        Library.BookCategory fiction = new Library.BookCategory("Fiction");
        fiction.showCategory();

        // Create object of static inner class inside BookCategory
        Library.BookCategory.Book book1 = new Library.BookCategory.Book("The Alchemist", "Paulo Coelho");
        book1.displayBook();
    }
}
