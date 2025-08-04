package com.vaishnavi.practice.staticClass.staticInner;

public class BankAccount {
    private static String bankName = "Vaishnavi Bank";

    // Static Inner Class
    static class AccountDetails {
        private int accountNumber;
        private String accountHolder;

        // Constructor
        public AccountDetails(int accountNumber, String accountHolder) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
        }

        // Method to display account info
        public void showDetails() {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);
        }
    }

    public static void main(String[] args) {
        // Creating object of static inner class
        BankAccount.AccountDetails acc = new BankAccount.AccountDetails(1001, "Vaishnavi");
        acc.showDetails();
    }
}
