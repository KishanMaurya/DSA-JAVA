package com.example.bankapp.service;

import com.example.bankapp.entity.Account;

import java.util.List;

public interface AccountService {
    public Account createAccount(Account account);
    public Account getAccountNumber(Long accountNumber);
    public List<Account> getAllAccounts();
    public Account depositAmount(Long accountNumber, Double amount);
    public Account withdrawAmount(Long accountNumber, Double amount);
    public void CloseAccount(Long accountNumber);
}
