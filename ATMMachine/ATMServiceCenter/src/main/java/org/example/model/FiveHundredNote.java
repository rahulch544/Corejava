package org.example.model;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class FiveHundredNote implements BankNote{
    private final String name;
    private Integer value;
    public FiveHundredNote(){
        this.name ="Five Hundred Rupees";
        this.value = 500;
    }
}