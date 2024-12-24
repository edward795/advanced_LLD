package org.example.Design_ATM.AmountWithDrawal;

import org.example.Design_ATM.ATM;

public class FiveHundredWithdrawProcessor extends CashWithdrawProcessor{
    public FiveHundredWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        super(cashWithdrawProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount) {
        int required=remainingAmount/500;
        int balance=remainingAmount%500;

        if(required<=atm.getNoOfFiveHundredNotes()){
            atm.deductFiveHundredNotes(required);
        }else if(required>atm.getNoOfFiveHundredNotes()){
            atm.deductFiveHundredNotes(atm.getNoOfFiveHundredNotes());
            balance+=(required-atm.getNoOfFiveHundredNotes())*500;
        }

        if(balance!=0){
            super.withdraw(atm,balance);
        }
    }
}
