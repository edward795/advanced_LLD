package org.example.Design_Vending_Machine_state_design_pattern.VendingState;

import org.example.Design_Vending_Machine_state_design_pattern.Coin;
import org.example.Design_Vending_Machine_state_design_pattern.Item;
import org.example.Design_Vending_Machine_state_design_pattern.ItemType;
import org.example.Design_Vending_Machine_state_design_pattern.VendingMachine;

import java.util.List;

public class SelectionState implements State{
    public SelectionState() {
        System.out.println("Currently Vending Machine is in Selection State");
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
        throw new Exception("product cannot be in insert coin in selection state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        Item item=machine.getInventory().getItem(codeNumber);

        int paidByUser=0;
        for(Coin coin:machine.getCoinList()){
            paidByUser=paidByUser+coin.value;
        }

        if(paidByUser< item.getPrice()){
            System.out.println("Insufficient Amount,Product you selected is for price : "+item.getPrice()
            +"and you paid : "+paidByUser);
            refundFullMoney(machine);
            throw new Exception("insufficient amount!!");
        }else if(paidByUser>= item.getPrice()){
            if(paidByUser>=item.getPrice()){
                getChange(paidByUser-item.getPrice());
            }
            machine.setVendingMachineState(new DispenseState(machine,codeNumber));
        }
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("returned the change in the Coin Dispense tray : "+returnChangeMoney);
        return returnChangeMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product cannot be in dispense product state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("product cannot be updated in selection state");
    }
}
