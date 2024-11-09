package org.example.Design_ParkingSpot.managers;

public class HourlyPricingStrategy implements PricingStrategy{
    @Override
    public int price() {
        return 60*10;
    }
}
