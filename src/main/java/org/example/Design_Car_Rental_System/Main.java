package org.example.Design_Car_Rental_System;

import org.example.Design_Car_Rental_System.product.*;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users =addUsers();
        List<Vehicle> vehicles=addVehicles();
        List<Store> stores=addStores(vehicles);

        VehicleRentalSystem rentalSystem=new VehicleRentalSystem(stores,users);
        User user= users.get(0);
        Location location=new Location(403012,"Bangalore","Karnataka","India");

        Store store= rentalSystem.getStore(location);

        List<Vehicle> storeVehicles=store.getVehicles(VehicleType.CAR);

        Reservation reservation=store.createReservation(storeVehicles.get(0), users.get(0));

        Bill bill=new Bill(reservation);
        Payment payment=new Payment();
        payment.payBill(bill);

        store.completeReservation(reservation.reservationId);

    }

    public static List<Vehicle> addVehicles(){
        List<Vehicle> vehicles=new ArrayList<>();
        Vehicle vehicle1=new Car();
        vehicle1.setVehicleID(1);
        vehicle1.setVehicleType(VehicleType.CAR);

        Vehicle vehicle2=new Car();
        vehicle2.setVehicleID(2);
        vehicle2.setVehicleType(VehicleType.CAR);

        return vehicles;
    }
    private static List<User> addUsers() {
        List<User> users= new ArrayList<>();
        User user1=new User();
        user1.setUserId(1);
        users.add(user1);
        return users;
    }

    public static List<Store> addStores(List<Vehicle> vehicles){
        List<Store> stores=new ArrayList<>();
        Store store1=new Store();
        store1.storeId=1;
        store1.setVehicles(vehicles);
        store1.setVehicles(vehicles);

        stores.add(store1);
        return stores;
    }
}
