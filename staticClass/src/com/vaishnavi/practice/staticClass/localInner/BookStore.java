package com.vaishnavi.practice.staticClass.localInner;

public class BookStore {

    // Static nested class (used for utility or static data)
    static class DiscountHelper {
        static double getDiscountRate() {
            return 0.1; // 10% discount
        }
    }

    public void purchaseBook(String bookName, double price) {
        // Local Inner Class
        class Book {
            String name;
            double originalPrice;

            Book(String name, double price) {
                this.name = name;
                this.originalPrice = price;
            }

            void printBill() {
                double discount = DiscountHelper.getDiscountRate();
                double finalPrice = originalPrice - (originalPrice * discount);
                System.out.println("Book: " + name);
                System.out.println("Original Price: ₹" + originalPrice);
                System.out.println("Discounted Price: ₹" + finalPrice);
            }
        }

        Book book = new Book(bookName, price);
        book.printBill();
    }

    public static void main(String[] args) {
        BookStore store = new BookStore();
        store.purchaseBook("Java Programming", 500.0);
    }
}


