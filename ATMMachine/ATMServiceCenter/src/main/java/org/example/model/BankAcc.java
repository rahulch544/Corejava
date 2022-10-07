package org.example.model;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class BankAcc {

    final String accountNo;
    private Float balance;
}
