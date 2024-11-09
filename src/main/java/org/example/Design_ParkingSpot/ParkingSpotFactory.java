package org.example.Design_ParkingSpot;

import org.example.Design_ParkingSpot.managers.FourWheelerManager;
import org.example.Design_ParkingSpot.managers.ParkingSpotManager;
import org.example.Design_ParkingSpot.managers.TwoWheelerManager;
import org.example.Design_ParkingSpot.models.VehicleType;

public class ParkingSpotFactory {
    ParkingSpotManager getParkingSpotManager(VehicleType vehicleType){
        if(vehicleType.equals(VehicleType.TWO_WHEELER)){
            return new TwoWheelerManager();
        }else if(vehicleType.equals(VehicleType.FOUR_WHEELER)){
            return new FourWheelerManager();
        }
        return null;
    }
}
