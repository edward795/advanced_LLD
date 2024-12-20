package org.example.nulll_object_design_pattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=VehicleFactory.getVehicleObject("Bike");
        System.out.println("Seating Capacity : "+vehicle.getSeatingCapacity());
        System.out.println("Fuel Tank Capacity : "+vehicle.getTankCapacity());
    }
}
