package org.example.Design_Vending_Machine_state_design_pattern.VendingState;

import org.example.Design_Vending_Machine_state_design_pattern.Coin;
import org.example.Design_Vending_Machine_state_design_pattern.Item;
import org.example.Design_Vending_Machine_state_design_pattern.VendingMachine;

import java.util.List;

public class HasMoneyState implements State{
    HasMoneyState(){
        System.out.println("Currently Vending machine is in HasMoneyState");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("product cannot be in insert coin state");
    }

    @Override
    public void clickOnStartProductionSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("product cannot be in start product selection state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("product cannot be in insert coin state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product cannot be in choose product state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("product cannot be in get change state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product cannot be in dispense product state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the coin dispense tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("product cannot be in update inventory state");
    }
}
