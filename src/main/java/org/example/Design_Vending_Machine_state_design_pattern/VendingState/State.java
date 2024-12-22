package org.example.Design_Vending_Machine_state_design_pattern.VendingState;

import org.example.Design_Vending_Machine_state_design_pattern.Coin;
import org.example.Design_Vending_Machine_state_design_pattern.Item;
import org.example.Design_Vending_Machine_state_design_pattern.VendingMachine;

import java.util.List;

public interface State {
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception;
    public void clickOnStartProductionSelectionButton(VendingMachine machine) throws Exception;
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception;
    public void chooseProduct(VendingMachine machine,int codeNumber) throws Exception;
    public int getChange(int returnChangeMoney) throws Exception;
    public Item dispenseProduct(VendingMachine machine,int codeNumber) throws Exception;
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception;
    public void updateInventory(VendingMachine machine,Item item,int codeNumber) throws Exception;
}
