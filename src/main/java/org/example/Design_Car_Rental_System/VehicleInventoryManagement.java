package org.example.Design_Car_Rental_System;

import org.example.Design_Car_Rental_System.product.Vehicle;

import java.util.List;

public class VehicleInventoryManagement {
    List<Vehicle> vehicles;

    public VehicleInventoryManagement(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}