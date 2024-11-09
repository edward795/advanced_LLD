package org.example.Design_ParkingSpot.models;

public class FourWheelerParkingSpot extends ParkingSpot{
    public FourWheelerParkingSpot(int id, boolean isEmpty, Vehicle vehicle, int price) {
        super(id, isEmpty, vehicle, 20);
    }
}
