package com.vaishnavi.practice.staticClass.memberInner;

public class Book {
    private String title = "Java Programming";

    // Member Inner Class (non-static)
    class Publisher {
        private String publisherName = "TechPress";

        public void showDetails() {
            System.out.println("Book Title: " + title); // Can access outer class members
            System.out.println("Published By: " + publisherName);
        }
    }

    public static void main(String[] args) {
        // Create outer class object
        Book book = new Book();

        // Create inner class object using outer class object
        Book.Publisher publisher = book.new Publisher();
        publisher.showDetails();
    }
}
