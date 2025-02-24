package com.vaishnavi.practice.java8Featues.defaultMethod;

public class LightBillExample {
    public static void main(String[] args) {
        // Creating residential and commercial customers
        ResidentialCustomer customer1 = new ResidentialCustomer("Supriya", 150);
        CommercialCustomer customer2 = new CommercialCustomer("SuperMart", 300);

        // Printing bills
        customer1.printBill();
        customer2.printBill();
    }
}
