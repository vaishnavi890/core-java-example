package com.vaishnavi.practice.constuctor.defaultConstructor;

public class BankAccount {
    String accountHolder;
    double balance;

    // Default constructor
    BankAccount() {
        accountHolder = "Unknown";
        balance = 0.0;
        System.out.println("Bank account created using Default Constructor");
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: ₹" + balance);
    }
}
