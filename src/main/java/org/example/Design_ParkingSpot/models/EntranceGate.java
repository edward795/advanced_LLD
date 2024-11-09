package org.example.Design_ParkingSpot.models;

import org.example.Design_ParkingSpot.ParkingSpotFactory;
import org.example.Design_ParkingSpot.managers.ParkingSpotManager;

public class EntranceGate {
    ParkingSpotManager parkingSpotManager;
    ParkingSpotFactory parkingSpotFactory;

    public EntranceGate(ParkingSpotManager parkingSpotManager, ParkingSpotFactory parkingSpotFactory) {
        this.parkingSpotManager = parkingSpotManager;
        this.parkingSpotFactory = parkingSpotFactory;
    }

    public ParkingSpotManager getParkingSpotManager() {
        return parkingSpotManager;
    }

    public void setParkingSpotManager(ParkingSpotManager parkingSpotManager) {
        this.parkingSpotManager = parkingSpotManager;
    }

    public ParkingSpotFactory getParkingSpotFactory() {
        return parkingSpotFactory;
    }

    public void setParkingSpotFactory(ParkingSpotFactory parkingSpotFactory) {
        this.parkingSpotFactory = parkingSpotFactory;
    }

    void findSpace(VehicleType vehicleType)
    {
    }

    void BookSpot(Vehicle vehicle){

    }

    void generateticket(Vehicle vehicle,ParkingSpot parkingSpot){

    }
}
