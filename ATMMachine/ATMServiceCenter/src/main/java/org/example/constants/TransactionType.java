package org.example.constants;

import java.util.Arrays;

public enum TransactionType {
    WITHDRAW_CASH,SHOW_BALANCE;

    public static void showAllTypesOfTransactions(){
        Arrays.stream(TransactionType.values()).forEach(x->System.out.println(x));
    }
}
