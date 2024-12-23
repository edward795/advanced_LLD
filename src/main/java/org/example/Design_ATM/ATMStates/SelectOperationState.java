package org.example.Design_ATM.ATMStates;

import org.example.Design_ATM.ATM;
import org.example.Design_ATM.Card;
import org.example.Design_ATM.TransactionType;

import javax.swing.plaf.nimbus.State;


public class SelectOperationState extends ATMState {
    public SelectOperationState() {
        showOperations();
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType txnType) {
        switch(txnType){
            case CASH_WITHDRAWAL :
                atm.setCurrentATMState(new CashWithDrawalState());
                break;
            case BALANCE_CHECK :
                atm.setCurrentATMState(new CheckBalanceState());
                break;
            default:{
                System.out.println("Invalid Option");
                exit(atm);
            }
        }
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

    private void showOperations(){
        System.out.println("Please select the Operation");
        TransactionType.showAllTransactionTypes();
    }
}
