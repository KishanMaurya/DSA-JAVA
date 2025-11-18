package com.example.bankapp.controller;

import com.example.bankapp.entity.Account;
import com.example.bankapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService  service;
    //create the account
    @PostMapping("/create")
    public ResponseEntity<Account> createAccount(@RequestBody Account account){
        Account createAccount = service.createAccount(account);
        return ResponseEntity.status(HttpStatus.CREATED).body(createAccount);
    }
    //
    @GetMapping("/{accountNumber}")
    public Account getAccountByAccountNumber(@PathVariable Long accountNumber){
        Account account = service.getAccountNumber(accountNumber);
        return account;
    }

    //Get all the account number
    @GetMapping("/getAllAccountsDetails")
    public List<Account> getAllAccount(){
        List<Account> getAllAccount = service.getAllAccounts();
        return getAllAccount;
    }

    @PutMapping("/deposit/{accountNumber}/{amount}")
    public Account depositAccount(@PathVariable Long accountNumber, @PathVariable Double amount){
        Account deposit = service.depositAmount(accountNumber, amount);
        return deposit;
    }

    @PutMapping("/withdraw/{accountNumber}/{amount}")
    public Account withdrawAccount(@PathVariable Long accountNumber, @PathVariable Double amount){
        Account accountWithdraw = service.withdrawAmount(accountNumber, amount);
        return accountWithdraw;
    }

    @DeleteMapping("/delete/{accountNumber}")
    public ResponseEntity deleteAccount(@PathVariable Long accountNumber){
        service.CloseAccount(accountNumber);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Account Closed");
    }
}
