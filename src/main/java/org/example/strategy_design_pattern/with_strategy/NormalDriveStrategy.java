package org.example.strategy_design_pattern.with_strategy;

public class NormalDriveStrategy implements Strategy{
    @Override
    public void drive(){
        System.out.println("Normal drive capability!");
    }
}
