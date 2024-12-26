package org.example.Design_SplitWise.Expense.Split;

import org.example.Design_SplitWise.User.User;

public class Split {
    User user;
    double amountDwe;

    public Split(User user, double amountDwe) {
        this.user = user;
        this.amountDwe = amountDwe;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmountDwe() {
        return amountDwe;
    }

    public void setAmountDwe(double amountDwe) {
        this.amountDwe = amountDwe;
    }
}
