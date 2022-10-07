package org.example.services;

import lombok.NonNull;
import org.example.model.BankAcc;
import org.example.model.Card;

import java.util.HashMap;
import java.util.Map;


public class CardService {
    private static final Map<String, Card> cards=new HashMap<>();
    private static final BankService bankService=new BankService();

//    public CardService(){
//        cards = new HashMap<>();
//        bankService = new BankService();
//    }

    public Card createCard(BankAcc bankAcc, String cardHolderName, String pin){
        Card card = new Card(bankAcc,cardHolderName,pin);
        cards.put(card.getCardNo(),card);
        return card;
    }
    public Boolean validatePin(@NonNull final String cardNo,@NonNull final String pin){
        return cards.get(cardNo).getPin().equals(pin);
    }

    public Float getBankBalance(@NonNull final String cardNo){
        Card card = cards.get(cardNo);
        return card.getBankAcc().getBalance();
    }

    public  Boolean withDrawCash(@NonNull final String cardNo, @NonNull Integer cash){
        BankAcc bankAcc = cards.get(cardNo).getBankAcc();
        return bankService.withdrawBalance(bankAcc.getAccountNo(),cash);
    }
}
