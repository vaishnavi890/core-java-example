package com.vaishnavi.bank.service;

import com.vaishnavi.bank.model.Account;
import com.vaishnavi.bank.repository.AccountRepository;

import java.util.List;
import java.util.Set;

public class AccountService {
    private final AccountRepository accountRepository = new AccountRepository();

    public Account openAccount() {
        // sysout -> msg and accept the data from user
        Account account = new Account();
        account.setAccountNo(1234);
        account.setFirstName("Vaishnavi");
        account.setSecondName("Chevale");
        return accountRepository.openAccount(account);
    }

    public Account viewAccount(int accountNumber) {
        return accountRepository.getAccount(accountNumber);
    }

    public Set<Account> getAllAccounts() {
        return accountRepository.getAllAccounts();
    }
}

