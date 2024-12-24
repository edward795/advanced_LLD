package org.example.Design_ATM.AmountWithDrawal;

import org.example.Design_ATM.ATM;

public class OneHundredWithdrawProcessor extends CashWithdrawProcessor{
    public OneHundredWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        super(cashWithdrawProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount) {
        int required=remainingAmount/100;
        int balance=remainingAmount%100;

        if(required<=atm.getNoOfOneHundredNotes()){
            atm.deductOneHundredNotes(required);
        }else if(required>atm.getNoOfOneHundredNotes()){
            atm.deductOneHundredNotes(atm.getNoOfOneHundredNotes());
            balance+=(required-atm.getNoOfOneHundredNotes())*100;
        }

        if(balance!=0){
            System.out.println("Something went wrong");
        }
    }
}
