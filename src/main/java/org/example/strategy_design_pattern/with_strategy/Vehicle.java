package org.example.strategy_design_pattern.with_strategy;

public class Vehicle {
    Strategy driveStartegyObj;

    Vehicle(Strategy obj){
        this.driveStartegyObj=obj;
    }

    public void drive(){
        driveStartegyObj.drive();
    }
}
