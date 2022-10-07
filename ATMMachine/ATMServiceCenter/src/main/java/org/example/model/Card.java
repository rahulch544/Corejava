package org.example.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Card {

    private final String cardNo;
    private final String cvv;
    private final String cardHolderName;
    private String pin;
    private BankAcc bankAcc;

    public Card(BankAcc bankAcc,String cardHolderName,String pin){
        this.cardHolderName = cardHolderName;
        this.bankAcc = bankAcc;
        this.pin = pin;
        this.cardNo = UUID.randomUUID().toString();
        this.cvv ="123";
    }

}
