package org.example.Design_ParkingSpot.models;

public class Ticket {
    long entryTime;
    Vehicle v;
    ParkingSpot parkingSpot;

    public Ticket(long entryTime, Vehicle v, ParkingSpot parkingSpot) {
        this.entryTime = entryTime;
        this.v = v;
        this.parkingSpot = parkingSpot;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(long entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getV() {
        return v;
    }

    public void setV(Vehicle v) {
        this.v = v;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
