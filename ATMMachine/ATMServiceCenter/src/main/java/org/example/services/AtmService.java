package org.example.services;

import org.example.model.ATM;
import org.example.model.Denomination;

public class AtmService {

    public Integer getAtmBalance(ATM atm){

//       Integer avblBalance =0;

//       for(Denomination denomination: atm.getDenominations()){
//           avblBalance +=denomination.getBankNote().getValue() *denomination.getNoOfNotes();
//        }

       return atm.getDenominations().stream().mapToInt(i-> i.getNoOfNotes() * i.getBankNote().getValue()).sum();
    }

    public Boolean withDrawAmount(ATM atm,Integer cash){

        if(getAtmBalance(atm)>=cash){
            for(Denomination denomination: atm.getDenominations()){
                if(cash ==0){
                    break;
                }
                Integer noOfNotes = denomination.getNoOfNotes();
                Integer value = denomination.getBankNote().getValue();
                if(noOfNotes*value >=cash){

                    System.out.println("Denomination "+denomination.getBankNote().getValue() +" * "+ cash/value);
                    denomination.setNoOfNotes(noOfNotes - cash/value);
                    cash = cash - (cash/value) *value;
                }
            }
            return true;
        }
            System.out.println("Money Not Available");
            return false;
    }
}
