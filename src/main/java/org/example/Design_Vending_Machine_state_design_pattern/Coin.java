package org.example.Design_Vending_Machine_state_design_pattern;

public enum Coin {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);

    public int value;

    Coin(int value){
        this.value=value;
    }
}
