package com.ironhack.edgeclient.controller;

import com.ironhack.edgeclient.model.BalanceDTO;
import com.ironhack.edgeclient.service.EdgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EdgeController {

    @Autowired
    EdgeService edgeService;

    @GetMapping("/get_balance_account/{id}")
    @ResponseStatus(HttpStatus.OK)
    public BalanceDTO getBalanceAccount(@PathVariable("id") Integer idAccount) throws Exception {
        return edgeService.getBalanceAccount(idAccount);
    }


}
