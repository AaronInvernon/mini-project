package com.ironhack.accountholderclient.service;

import com.ironhack.accountholderclient.client.BankAccount;
import com.ironhack.accountholderclient.model.BalanceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountHolderService {

    @Autowired
    BankAccount bankAccount;

    public BalanceDTO getBalanceAccount(Integer accountId) throws Exception {
        return bankAccount.getBalanceAccount(accountId);
    }
}
