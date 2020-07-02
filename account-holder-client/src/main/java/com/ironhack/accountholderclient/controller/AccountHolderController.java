package com.ironhack.accountholderclient.controller;

import com.ironhack.accountholderclient.model.BalanceDTO;
import com.ironhack.accountholderclient.service.AccountHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountHolderController {

    @Autowired
    AccountHolderService accountHolderService;

    @GetMapping("/get_balance_account/{id}")
    @ResponseStatus(HttpStatus.OK)
    public BalanceDTO getBalanceAccount(@PathVariable("id") Integer accountId) throws Exception {
        return accountHolderService.getBalanceAccount(accountId);
    }
}
