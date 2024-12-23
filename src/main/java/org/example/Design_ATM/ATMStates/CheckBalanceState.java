package org.example.Design_ATM.ATMStates;

import org.example.Design_ATM.ATM;
import org.example.Design_ATM.Card;

public class CheckBalanceState extends ATMState{
    public CheckBalanceState() {
    }

    @Override
    public void displayBalance(ATM atm, Card card) {
        System.out.println("Your Balance : "+card.getBankBalance());
        exit(atm);
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

    @Override
    public void exit(ATM atmObject) {
        returnCard();
        atmObject.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }
}
