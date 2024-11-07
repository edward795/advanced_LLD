package org.example.strategy_design_pattern.with_strategy;

public class SportsDriveStrategy implements Strategy{
    @Override
    public void drive() {
        System.out.println("Sports drive capability!");
    }
}
