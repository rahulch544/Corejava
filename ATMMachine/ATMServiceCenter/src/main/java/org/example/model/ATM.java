package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.state.ATMState;
import org.example.state.IdleState;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class ATM {
        private ATMState atmState;
        private final List<Denomination> denominations;

        public ATM(List<Denomination> denominations){
                this.atmState = new IdleState();
                this.denominations = denominations;
        }

}
