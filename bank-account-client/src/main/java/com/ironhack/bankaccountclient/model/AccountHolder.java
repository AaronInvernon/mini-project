package com.ironhack.bankaccountclient.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Data
@Entity
public class AccountHolder extends User {

    private String name;

    private LocalDate birthday;

    private String primaryAddress;

    private String mailingAddress;

    @OneToOne(mappedBy="primaryOwner", fetch= FetchType.LAZY, optional=false)
    private Checking primaryChecking;

    @OneToOne(mappedBy="secondaryOwner", fetch=FetchType.LAZY)
    private Checking secondaryChecking;

    @OneToOne(mappedBy ="primaryOwner", fetch=FetchType.LAZY, optional=false)
    private CreditCard primarycreditCard;

    @OneToOne(mappedBy ="secondaryOwner", fetch=FetchType.LAZY)
    private CreditCard secondcreditCard;
}
