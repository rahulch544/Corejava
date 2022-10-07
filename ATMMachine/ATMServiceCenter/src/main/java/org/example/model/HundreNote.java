package org.example.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class HundreNote implements BankNote{
    private final String name;
    private Integer value;
    public HundreNote(){
        this.name ="One Hundred Rupees";
        this.value = 100;
    }
}