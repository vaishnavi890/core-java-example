package com.vaishnavi.practice.staticClass.memberInner;

public class Bank {

    private String bankName = "State Bank of Java";

    // ✅ Member Inner Class (non-static)
    class Account {
        private String accountHolder;
        private double balance;

        Account(String accountHolder, double balance) {
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        void displayDetails() {
            System.out.println("Bank: " + bankName); // accessing outer class member
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: ₹" + balance);
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        // Creating object of member inner class
        Bank.Account acc1 = bank.new Account("Vaishnavi", 10000.0);
        Bank.Account acc2 = bank.new Account("Ravi", 15000.0);

        acc1.displayDetails();
        System.out.println("---------------------------");
        acc2.displayDetails();
    }
}


