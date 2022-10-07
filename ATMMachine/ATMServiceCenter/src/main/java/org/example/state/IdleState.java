package org.example.state;

import org.example.model.ATM;
import org.example.model.Card;

public class IdleState extends ATMState{

    public void insertCard(ATM atm, Card card){
    System.out.println("Processing Card");
    atm.setAtmState(new HasCardState());
    }
}
