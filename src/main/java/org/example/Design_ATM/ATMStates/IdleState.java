package org.example.Design_ATM.ATMStates;

import org.example.Design_ATM.ATM;
import org.example.Design_ATM.Card;

public class IdleState extends ATMState{
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
