package com.vaishnavi.practice.staticClass.memberInner;

public class BookStoreExample {
    // Static nested class (allowed)
    static class Discount {
        static double getRate() {
            return 0.15; // 15% discount
        }
    }

    // Member inner class (non-static)
    class Book {
        String title;
        double price;

        Book(String title, double price) {
            this.title = title;
            this.price = price;
        }

        void showFinalPrice() {
            double discount = Discount.getRate(); // Access static class
            double finalPrice = price - (price * discount);
            System.out.println("Book: " + title);
            System.out.println("Price after 15% discount: ₹" + finalPrice);
        }
    }

    public static void main(String[] args) {
        BookStoreExample store = new BookStoreExample();
        BookStoreExample.Book book = store.new Book("Java Basics", 600);
        book.showFinalPrice();
    }
}
