package org.example.Design_ATM.AmountWithDrawal;

import org.example.Design_ATM.ATM;

public abstract class CashWithdrawProcessor {

    CashWithdrawProcessor nextCashWithdrawalProcessor;
    CashWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor){
        this.nextCashWithdrawalProcessor=cashWithdrawProcessor;
    }

    public void withdraw(ATM atm, int remainingAmount){
        if(nextCashWithdrawalProcessor!=null){
            nextCashWithdrawalProcessor.withdraw(atm,remainingAmount);
        }
    }
}
