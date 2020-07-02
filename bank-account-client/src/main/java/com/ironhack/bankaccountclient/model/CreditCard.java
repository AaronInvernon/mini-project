package com.ironhack.bankaccountclient.model;

import com.ironhack.bankaccountclient.validation.Between;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
public class CreditCard {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private BigDecimal balance;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="primary_owner_id")
    private AccountHolder primaryOwner;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="secondary_owner_id")
    private AccountHolder secondaryOwner;

    @Between(from="100", to="100000", message="creditLimit not in the required range")
    private BigDecimal creditLimit;

    @Between(from="0.1", to="0.2", message="interestRate not in the required range")
    private BigDecimal interestRate;

    private BigDecimal penaltyFee;

    private String moneyType;

    private LocalDate creationDate;

    private String secretKey;
}
