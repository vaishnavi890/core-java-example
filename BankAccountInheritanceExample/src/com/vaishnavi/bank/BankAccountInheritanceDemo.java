package com.vaishnavi.bank;

import com.vaishnavi.bank.model.Account;
import com.vaishnavi.bank.model.SavingsAccount;
import com.vaishnavi.bank.service.SavingsAccountService;



public class BankAccountInheritanceDemo {
    public static void main(String[] args) {
        SavingsAccountService savingsAccountService  = new SavingsAccountService();

        Account account = savingsAccountService.openAccount();

        System.out.println("Account opened: " + account);
        System.out.println("All opened accounts in this bank: ");

        savingsAccountService.getAllAccounts().forEach(System.out::println);

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountNo(account.getAccountNo());
        savingsAccount.setFirstName(account.getFirstName());
        savingsAccount.setSecondName(account.getSecondName());
        savingsAccount.setBalance(1000);

        System.out.println("Interest: " + savingsAccountService.calculateInterest(savingsAccount));
    }
}
