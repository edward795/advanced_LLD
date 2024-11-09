package org.example.Design_ParkingSpot.managers;

import org.example.Design_ParkingSpot.models.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerManager implements ParkingSpotManager{
    List<ParkingSpot> parkingSpot=new ArrayList();
    public TwoWheelerManager(){
        super();
    }
}
