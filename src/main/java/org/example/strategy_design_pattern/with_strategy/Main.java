package org.example.strategy_design_pattern.with_strategy;

public class Main {
    public static void main(String[] args) {
        Vehicle normalVeicle=new NormalVehicle();
        normalVeicle.drive();
        Vehicle sportsVehicle =new SportsVehicle();
        sportsVehicle.drive();
    }
}
