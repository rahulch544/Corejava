package org.example.state;

import org.example.constants.TransactionType;
import org.example.model.ATM;
import org.example.model.Card;

public class SelectOperationState extends  ATMState{

    public SelectOperationState(){
        showOperations();
    }

    public void selectOperation(ATM atm, Card card, TransactionType transactionType){
        switch (transactionType) {

            case WITHDRAW_CASH:
                atm.setAtmState(new CashWithDrawalState());
                break;
            case SHOW_BALANCE:
                atm.setAtmState(new CheckBalanceState());
                break;
            default: {
                System.out.println("Invalid Option");
                exit(atm);
            }

        }
    }

    public void returnCard(){
        System.out.println("Please take card");
    }

    public void exit(ATM atm){
        returnCard();
        atm.setAtmState(new IdleState());
        System.out.println("Exiting !!!");

    }
    private void showOperations(){
        System.out.println("please select operations");
        TransactionType.showAllTypesOfTransactions();
    }
}
