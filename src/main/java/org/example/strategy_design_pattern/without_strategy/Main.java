package org.example.strategy_design_pattern.without_strategy;

public class Main {
    public static void main(String[] args) {
        Vehicle offRoadVehicle=new OffRoadVehicle();
        offRoadVehicle.drive();
        Vehicle goodsVehicle=new GoodsVehicle();
        goodsVehicle.drive();

    }
}
