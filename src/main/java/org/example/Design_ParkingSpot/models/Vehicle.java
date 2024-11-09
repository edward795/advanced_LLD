package org.example.Design_ParkingSpot.models;

public class Vehicle {
    int vehicleNo;
    int vehicleType;

    public Vehicle(int vehicleNo, int vehicleType) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
    }

    public int getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public int getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(int vehicleType) {
        this.vehicleType = vehicleType;
    }
}
