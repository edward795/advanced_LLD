package org.example.Design_ParkingSpot.managers;

public class MinutePricingStrategy implements PricingStrategy{
    @Override
    public int price() {
        return 60*60*10;
    }
}
