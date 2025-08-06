package com.vaishnavi.practice.staticInjava.staticNestedclass;

public class Bank {

    static int totalAccounts = 0;

    // Static nested class
    static class Account {
        int accountId;

        Account(int id) {
            this.accountId = id;
            totalAccounts++;
        }

        void showDetails() {
            System.out.println("Account ID: " + accountId);
            System.out.println("Total Accounts: " + totalAccounts);
        }
    }

    public static void main(String[] args) {
        Bank.Account acc1 = new Bank.Account(101);
        acc1.showDetails();

        Bank.Account acc2 = new Bank.Account(102);
        acc2.showDetails();
    }
}


