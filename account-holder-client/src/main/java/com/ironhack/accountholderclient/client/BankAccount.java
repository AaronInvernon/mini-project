package com.ironhack.accountholderclient.client;

import com.ironhack.accountholderclient.model.BalanceDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="bank-account-client")
public interface BankAccount {

    @GetMapping("/get_balance_account/{id}")
    BalanceDTO getBalanceAccount(@PathVariable("id") Integer idAccount) throws Exception;

}
