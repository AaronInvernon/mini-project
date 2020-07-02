package com.ironhack.bankaccountclient.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
public class Checking {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    protected Integer id;

    protected BigDecimal balance;

    protected String secretKey;

    protected String moneyType;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="primary_owner_id")
    protected AccountHolder primaryOwner;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="secondary_owner_id")
    protected AccountHolder secondaryOwner;

    private BigDecimal minimumBalance;

    private BigDecimal penaltyFee;

    private BigDecimal monthlyMaintenanceFee;

    @Enumerated(EnumType.STRING)
    protected Status status;

    protected LocalDate creationDate;
}
