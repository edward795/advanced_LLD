package org.example.AbstractFactory_design_pattern.factory;

import org.example.AbstractFactory_design_pattern.abstract_factory.AbstractFactory;
import org.example.AbstractFactory_design_pattern.objects.Car;
import org.example.AbstractFactory_design_pattern.objects.EconomicCar1;
import org.example.AbstractFactory_design_pattern.objects.EconomicCar2;

public class EconomicCarFactory implements AbstractFactory {
    @Override
    public Car getInstance(int price) {
        if(price<=3000000){
            return new EconomicCar1();
        }else if(price>3000000){
            return new EconomicCar2();
        }
        return null;
    }
}
