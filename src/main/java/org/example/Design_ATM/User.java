package org.example.Design_ATM;

public class User {
    Card card;
    UserBankAccount userBankAccount;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
