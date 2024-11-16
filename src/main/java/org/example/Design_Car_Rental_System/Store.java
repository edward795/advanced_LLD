package org.example.Design_Car_Rental_System;


import org.example.Design_Car_Rental_System.product.Vehicle;
import org.example.Design_Car_Rental_System.product.VehicleType;
import java.util.ArrayList;
import java.util.List;

public class Store {

    int storeId;
    VehicleInventoryManagement vehicleInventoryManagement;
    Location storeLocation;
    List<Reservation> reservations=new ArrayList<>();

    public List<Vehicle> getVehicles(VehicleType vehicleType){
        return vehicleInventoryManagement.getVehicles();
    }

    public void setVehicles(List<Vehicle> vehicles){
        vehicleInventoryManagement=new VehicleInventoryManagement(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle,User user){
        Reservation reservation=new Reservation();
        reservation.createReserve(user, vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationId){
        return true;
    }
}
