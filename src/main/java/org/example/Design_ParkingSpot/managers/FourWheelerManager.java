package org.example.Design_ParkingSpot.managers;

import org.example.Design_ParkingSpot.models.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerManager implements ParkingSpotManager{

    List<ParkingSpot> parkingSpotList= new ArrayList<>();

    public FourWheelerManager(){
        super();
    }
}
