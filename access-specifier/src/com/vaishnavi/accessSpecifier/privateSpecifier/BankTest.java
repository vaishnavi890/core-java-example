package com.vaishnavi.accessSpecifier.privateSpecifier;

public class BankTest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("1234567890", 5000);

        // ✅ Access through public methods
        acc.deposit(1500);
        acc.displayAccount();

        // ❌ Direct access is NOT allowed (private variables)
        // acc.balance = 10000;      // ERROR
        // System.out.println(acc.accountNumber); // ERROR
    }
}
