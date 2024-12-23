package org.example.Design_ATM;

import org.example.Design_ATM.ATMStates.ATMState;

public class ATM {
    private static ATM atmObject=new ATM();
    ATMState currentATMState;

    private int atmBalance;
    int noOfTwoThousandNotes;
    int noOfFiveHundredNotes;
    int noOfOneHundredNotes;

    private ATM(){

    }

    public static ATM getAtmObject() {
        return atmObject;
    }

    public static void setAtmObject(ATM atmObject) {
        ATM.atmObject = atmObject;
    }

    public ATMState getCurrentATMState() {
        return currentATMState;
    }

    public void setCurrentATMState(ATMState currentATMState) {
        this.currentATMState = currentATMState;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance, int noOfTwoThousandNotes, int noOfFiveHundredNotes, int noOfOneHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public int getNoOfTwoThousandNotes() {
        return noOfTwoThousandNotes;
    }

    public void setNoOfTwoThousandNotes(int noOfTwoThousandNotes) {
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public void setNoOfFiveHundredNotes(int noOfFiveHundredNotes) {
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public void setNoOfOneHundredNotes(int noOfOneHundredNotes) {
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public void deductATMBalance(int amount){
        atmBalance-=amount;
    }

    public void deductTwoThousandNotes(int number){
        noOfTwoThousandNotes-=number;
    }

    public void deductFiveHundredNotes(int number){
        noOfFiveHundredNotes-=number;
    }

    public void deductOneHundredNotes(int number){
        noOfOneHundredNotes-=number;
    }

    public void printCurrentATMStatus(){
        System.out.println("Balance : "+atmBalance);
        System.out.println("2kNotes : "+noOfTwoThousandNotes);
        System.out.println("500Notes : "+noOfFiveHundredNotes);
        System.out.println("100Notes : "+noOfOneHundredNotes);
    }
}
