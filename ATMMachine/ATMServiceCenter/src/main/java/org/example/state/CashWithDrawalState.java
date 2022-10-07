package org.example.state;

import org.example.model.ATM;
import org.example.model.Card;
import org.example.services.AtmService;
import org.example.services.CardService;

public class CashWithDrawalState extends ATMState{

    public void cashWithdrawal(ATM atm, Card card, Integer withDrawAmt){
        CardService cardService = new CardService();
        AtmService atmService = new AtmService();
        System.out.println("Atm balance =" +atmService.getAtmBalance(atm));
        if((atmService.getAtmBalance(atm) >= withDrawAmt) &&
            (cardService.withDrawCash(card.getCardNo(),withDrawAmt))){
                atmService.withDrawAmount(atm,withDrawAmt);

                atm.setAtmState(new SelectOperationState());
        }else{
            exit( atm);
        }
    }

    public void exit(ATM atm){
        returnCard();
        atm.setAtmState(new IdleState());
    }
    public void returnCard(){
        System.out.println("please collect your card");
    }
}
