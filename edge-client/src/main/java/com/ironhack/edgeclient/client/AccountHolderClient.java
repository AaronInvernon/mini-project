package com.ironhack.edgeclient.client;

import com.ironhack.edgeclient.model.BalanceDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="account-holder-client")
public interface AccountHolderClient {

    @GetMapping("/get_balance_account/{id}")
    public BalanceDTO getBalanceAccount(@PathVariable("id") Integer accountId) throws Exception;
}
