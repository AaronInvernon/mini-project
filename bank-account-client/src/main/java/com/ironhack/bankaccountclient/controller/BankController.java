package com.ironhack.bankaccountclient.controller;

import com.ironhack.bankaccountclient.model.BalanceDTO;
import com.ironhack.bankaccountclient.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @Autowired
    BankService bankService;

    @GetMapping("/get_balance_account/{id}")
    @ResponseStatus(HttpStatus.OK)
    public BalanceDTO getBalanceAccount(@PathVariable("id") Integer idAccount) throws Exception {
        return bankService.getBalanceAccount(idAccount);
    }

    @GetMapping("/get_balance_credit_card/{id}")
    public BalanceDTO getBalanceCreditCard(@PathVariable("id") Integer idCreditCard) {
        return null;
    }
}
