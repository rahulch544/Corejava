package org.example.state;


import org.example.model.ATM;
import org.example.model.Card;

public class CashDisplayState extends ATMState {

    public void displayBalance(ATM atm, Card card){

        System.out.println(card.getBankAcc().getBalance());
    }
}
