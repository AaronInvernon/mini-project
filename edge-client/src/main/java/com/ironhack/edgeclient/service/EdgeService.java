package com.ironhack.edgeclient.service;

import com.ironhack.edgeclient.client.AccountHolderClient;
import com.ironhack.edgeclient.model.BalanceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdgeService {

    @Autowired
    AccountHolderClient accountHolderClient;

    public BalanceDTO getBalanceAccount(Integer accountId) throws Exception {
        return accountHolderClient.getBalanceAccount(accountId);
    }
}
