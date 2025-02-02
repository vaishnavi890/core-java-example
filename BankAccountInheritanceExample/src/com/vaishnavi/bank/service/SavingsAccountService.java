package com.vaishnavi.bank.service;

import com.vaishnavi.bank.model.Account;
import com.vaishnavi.bank.model.SavingsAccount;
import com.vaishnavi.bank.repository.SavingsAccountRepository;

public class SavingsAccountService extends AccountService{
    SavingsAccountRepository savingsAccountRepository = new SavingsAccountRepository();

    public double calculateInterest(SavingsAccount account) {
        return savingsAccountRepository.calculateInterest(account);
    }
}

