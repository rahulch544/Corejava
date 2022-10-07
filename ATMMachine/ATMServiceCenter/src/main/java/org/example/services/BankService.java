package org.example.services;

import lombok.NonNull;
import org.example.model.BankAcc;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BankService {

    static Map<String , BankAcc> bankAccs = new HashMap<>();

    public BankAcc CreateBankAcc(@NonNull Integer balance){
        BankAcc bankAcc =  new BankAcc(UUID.randomUUID().toString(),balance.floatValue());
        bankAccs.put(bankAcc.getAccountNo(),bankAcc);
        return bankAcc;
    }
    public Boolean withdrawBalance(@NonNull String AccId,
                                   @NonNull Integer amount){
        BankAcc bankAcc =  bankAccs.get(AccId);
        System.out.println("Bank Balance "+ bankAcc.getBalance());
        if(bankAcc.getBalance() >=amount){
            bankAcc.setBalance(bankAcc.getBalance() - amount);
            return true;
        }
        return false;
    }
}
