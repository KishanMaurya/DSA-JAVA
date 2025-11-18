package com.example.bankapp.service;

import com.example.bankapp.entity.Account;
import com.example.bankapp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImp implements AccountService {

    @Autowired
    AccountRepository accountRepository;
    @Override
    public Account createAccount(Account account) {
        Account account_saved = accountRepository.save(account);
        return account_saved;
    }

    @Override
    public Account getAccountNumber(Long accountNumber) {
        Optional<Account> get_account = accountRepository.findById(accountNumber);
        if(get_account.isEmpty()){
            throw new RuntimeException("Account does not exits");
        }
        Account account_found = get_account.get();
        return account_found;
    }

    @Override
    public List<Account> getAllAccounts() {
        List<Account> listOfAccount = accountRepository.findAll();
        return listOfAccount;
    }

    @Override
    public Account depositAmount(Long accountNumber, Double amount) {
        Optional<Account> account = accountRepository.findById(accountNumber);
        if (account.isEmpty()){
            throw new RuntimeException("Account does not exits");
        }
        Account accountPresent = account.get();
        double totalBalance = accountPresent.getAccount_balance() + amount;
        accountPresent.setAccount_balance(totalBalance);
        accountRepository.save(accountPresent);
        return accountPresent;
    }

    @Override
    public Account withdrawAmount(Long accountNumber, Double amount) {
        Optional<Account> account = accountRepository.findById(accountNumber);
        if (account.isEmpty()){
            throw new RuntimeException("Account does not exits");
        }
        Account accountPresent = account.get();
        double totalBalance = accountPresent.getAccount_balance() - amount;
        accountPresent.setAccount_balance(totalBalance);
        accountRepository.save(accountPresent);
        return accountPresent;
    }

    @Override
    public void CloseAccount(Long accountNumber) {
        getAccountNumber(accountNumber);
        accountRepository.deleteById(accountNumber);
    }
}
