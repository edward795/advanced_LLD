package org.example.Design_SplitWise.Expense;

import org.example.Design_SplitWise.Expense.Split.EqualExpenseSplit;
import org.example.Design_SplitWise.Expense.Split.ExpenseSplit;
import org.example.Design_SplitWise.Expense.Split.PercentageExpenseSplit;
import org.example.Design_SplitWise.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {
    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType){
        switch(splitType){
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;

        }
    }
}
