package org.example.Design_Vending_Machine_state_design_pattern.VendingState;

import org.example.Design_Vending_Machine_state_design_pattern.Coin;
import org.example.Design_Vending_Machine_state_design_pattern.Item;
import org.example.Design_Vending_Machine_state_design_pattern.VendingMachine;

import java.util.List;

public class DispenseState implements State{

    DispenseState(VendingMachine machine,int codeNumber) throws Exception{
        System.out.println("Currently Vending machine DispenseState");
        dispenseProduct(machine,codeNumber);
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("insert coin button can not be clicked in Dispense state");
    }

    @Override
    public void clickOnStartProductionSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("product selection button can not be clicked in Dispense state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("coin can not be inserted in Dispense state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can not be chosen in Dispense state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("change can not be returned in Dispense state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Product has been dispensed");;
        Item item=machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("refund can not be happen in Dispense state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("inventory cannot be updated in Dispense state");
    }
}