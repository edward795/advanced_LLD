package org.example.Design_Car_Rental_System.product;

import org.example.Design_Car_Rental_System.Location;
import org.example.Design_Car_Rental_System.Store;
import org.example.Design_Car_Rental_System.User;

import java.util.List;

public class VehicleRentalSystem {
    List<Store> storeList;
    List<User> userList;

    public VehicleRentalSystem(List<Store> storeList, List<User> userList) {
        this.storeList = storeList;
        this.userList = userList;
    }

    public Store getStore(Location location){
        return storeList.get(0);
    }
}
