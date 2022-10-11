package org.example;

import lombok.AllArgsConstructor;
import org.example.constants.TransactionType;
import org.example.model.*;
import org.example.services.BankService;
import org.example.services.CardService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BankNote hundred = new HundreNote();
        BankNote fiveHundred = new FiveHundredNote();
        BankNote twoThousandNote = new TwoThousandNote();

        List<Denomination> denominations = new ArrayList<>();
        denominations.add(new Denomination(twoThousandNote,10));
        denominations.add(new Denomination(fiveHundred,20));
        denominations.add(new Denomination(hundred,30));


        ATM atm = new ATM(denominations);

        BankService bankService = new BankService();
        BankAcc user = bankService.CreateBankAcc(3000);

        System.out.println(user);

        CardService cardService = new CardService();

        Card card = cardService.createCard(user,"Rahul","3456");

        atm.getAtmState().insertCard(atm,card);
        atm.getAtmState().authenticate(atm,card,"3416");
        atm.getAtmState().selectOperation(atm,card, TransactionType.WITHDRAW_CASH);
        atm.getAtmState().cashWithdrawal(atm,card,2000);

        atm.getAtmState().selectOperation(atm,card, TransactionType.SHOW_BALANCE);
        atm.getAtmState().displayBalance(atm,card);
    }
}