package org.example.Design_ParkingSpot.models;

import org.example.Design_ParkingSpot.ParkingSpotFactory;
import org.example.Design_ParkingSpot.managers.CostComputationManager;
import org.example.Design_ParkingSpot.managers.ParkingSpotManager;

public class ExitGate {
    Ticket ticket;
    ParkingSpotManager parkingSpotManager;

    CostComputationManager costComputationManager;

    ParkingSpotFactory parkingSpotFactory;

    public ExitGate(Ticket ticket, ParkingSpotManager parkingSpotManager, CostComputationManager costComputationManager, ParkingSpotFactory parkingSpotFactory) {
        this.ticket = ticket;
        this.parkingSpotManager = parkingSpotManager;
        this.costComputationManager = costComputationManager;
        this.parkingSpotFactory = parkingSpotFactory;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ParkingSpotManager getParkingSpotManager() {
        return parkingSpotManager;
    }

    public void setParkingSpotManager(ParkingSpotManager parkingSpotManager) {
        this.parkingSpotManager = parkingSpotManager;
    }

    public CostComputationManager getCostComputationManager() {
        return costComputationManager;
    }

    public void setCostComputationManager(CostComputationManager costComputationManager) {
        this.costComputationManager = costComputationManager;
    }

    public ParkingSpotFactory getParkingSpotFactory() {
        return parkingSpotFactory;
    }

    public void setParkingSpotFactory(ParkingSpotFactory parkingSpotFactory) {
        this.parkingSpotFactory = parkingSpotFactory;
    }

    void calCalculatePrice(Vehicle vehicle,ParkingSpot parkingSpot){

    }
    void makePayment(){

    }

    void removeVehicle(){

    }
}
