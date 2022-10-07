package org.example.state;

import org.example.model.ATM;
import org.example.model.Card;
import org.example.services.CardService;

public class HasCardState extends ATMState{

    public Boolean authenticate(ATM atm, Card card, String pin){
        CardService cardService =new CardService();
        if(cardService.validatePin(card.getCardNo(), pin)){
            System.out.println("Authentication Successfull");
            atm.setAtmState(new SelectOperationState());
            return true;
        }
        exit( atm);
        System.out.println("Authentication failure");
        return false;
    }

    public void exit(ATM atm){
        returnCard();
        atm.setAtmState(new IdleState());
    }
    public void returnCard(){
        System.out.println("please collect your card");
    }

}
