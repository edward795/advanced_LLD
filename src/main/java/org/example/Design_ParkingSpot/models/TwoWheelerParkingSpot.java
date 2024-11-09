package org.example.Design_ParkingSpot.models;

public class TwoWheelerParkingSpot extends ParkingSpot{
    public TwoWheelerParkingSpot(int id, boolean isEmpty, Vehicle vehicle, int price) {
        super(id, isEmpty, vehicle, 10);
    }

}
