package org.example.ATMState.AtmStates;

import org.example.ATMState.ATM;
import org.example.ATMState.Card;

public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}


