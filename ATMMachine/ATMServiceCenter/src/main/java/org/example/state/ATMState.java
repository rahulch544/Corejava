package org.example.state;

import org.example.constants.TransactionType;
import org.example.model.ATM;
import org.example.model.Card;

public abstract class ATMState {

     public void insertCard(ATM atm, Card card){
     System.out.println("Something went wrong");
     }

     public Boolean authenticate(ATM atm, Card card, String pin){
          System.out.println("Something went wrong");

         return false;
     }

     public void selectOperation(ATM atm,Card card, TransactionType transactionType){
          System.out.println("Something went wrong");

     }

     public void cashWithdrawal(ATM atm, Card card, Integer withDrawAmt){
          System.out.println("Something went wrong");

     }

     public void displayBalance(ATM atm, Card card){
          System.out.println("Something went wrong");

     }

     public void returnCard(){
          System.out.println("Something went wrong");

     }

     public void exit(ATM atm){
          System.out.println("Something went wrong");

     }
}

