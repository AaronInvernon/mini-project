package com.ironhack.bankaccountclient.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BalanceDTO {

    private BigDecimal balance;
    private String moneyType;

    public static BalanceDTO balanceToBalanceDTO(BigDecimal balance, String monetType) {
        BalanceDTO balanceDTO = new BalanceDTO();
        balanceDTO.setBalance(balance);
        balanceDTO.setMoneyType(monetType);
        return balanceDTO;
    }
}
