package com.vaishnavi.practice.staticClass.localInner;

public class Product {
    void calculateDiscount() {
        double price = 500.0;

        // Local Inner Class (defined inside a method)
        class Discount {
            double getDiscountAmount() {
                return price * 0.10; // 10% discount
            }

            void showDiscount() {
                System.out.println("Original Price: " + price);
                System.out.println("Discount Amount: " + getDiscountAmount());
                System.out.println("Final Price: " + (price - getDiscountAmount()));
            }
        }

        // Creating object of local inner class
        Discount discount = new Discount();
        discount.showDiscount();
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.calculateDiscount();
    }
}
