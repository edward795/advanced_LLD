package org.example.Design_ATM.ATMStates;

import org.example.Design_ATM.ATM;
import org.example.Design_ATM.AmountWithDrawal.CashWithdrawProcessor;
import org.example.Design_ATM.AmountWithDrawal.FiveHundredWithdrawProcessor;
import org.example.Design_ATM.AmountWithDrawal.OneHundredWithdrawProcessor;
import org.example.Design_ATM.AmountWithDrawal.TwoThousandWithdrawProcessor;
import org.example.Design_ATM.Card;

public class CashWithDrawalState extends ATMState{
    public CashWithDrawalState() {
        System.out.println("Please enter the Withdrawal Amount");
    }

    @Override
    public void cashWithdrawal(ATM atm, Card card, int withdrawAmount) {
        if(atm.getAtmBalance()<withdrawAmount){
            System.out.println("Insufficent fund in the ATM Machine");
            exit(atm);
        }else if(card.getBankBalance()<withdrawAmount){
            System.out.println("Insufficient fund in your Bank Account");
            exit(atm);
        }else{
            card.deductBankBalance(withdrawAmount);
            atm.deductATMBalance(withdrawAmount);
            //using chain of responsibility design pattern for 2000 rupees,500 rupees notes
            CashWithdrawProcessor withdrawProcessor=new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(
                    new OneHundredWithdrawProcessor(null)
            ));
            withdrawProcessor.withdraw(atm,withdrawAmount);
            exit(atm);
        }
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }
}
