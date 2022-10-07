package org.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TwoThousandNote implements BankNote{
    private final String name;
    private Integer value;
    public TwoThousandNote(){
        this.name ="Two Thousand Rupees";
        this.value = 2000;
    }
}
