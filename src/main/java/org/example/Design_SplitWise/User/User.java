package org.example.Design_SplitWise.User;

import org.example.Design_SplitWise.UserExpenseBalanceSheet;

public class User {
    String userId;
    String username;

    UserExpenseBalanceSheet userExpenseBalanceSheet;

    public User(String userId, String username) {
        this.userId = userId;
        this.username = username;
        userExpenseBalanceSheet=new UserExpenseBalanceSheet();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserExpenseBalanceSheet getUserExpenseBalanceSheet() {
        return userExpenseBalanceSheet;
    }

    public void setUserExpenseBalanceSheet(UserExpenseBalanceSheet userExpenseBalanceSheet) {
        this.userExpenseBalanceSheet = userExpenseBalanceSheet;
    }
}
