package com.ironhack.bankaccountclient.service;

import com.ironhack.bankaccountclient.model.BalanceDTO;
import com.ironhack.bankaccountclient.model.Checking;
import com.ironhack.bankaccountclient.repository.CheckingRepository;
import com.ironhack.bankaccountclient.repository.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {

    @Autowired
    CheckingRepository checkingRepository;

    @Autowired
    CreditCardRepository creditCardRepository;

    public BalanceDTO getBalanceAccount(Integer accountId) throws Exception {
        Checking checking = checkingRepository.findById(accountId).orElseThrow(() -> new Exception());
        return BalanceDTO.balanceToBalanceDTO(checking.getBalance(), checking.getMoneyType());
    }
}
