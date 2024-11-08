package org.example.AbstractFactory_design_pattern.factory;

import org.example.AbstractFactory_design_pattern.abstract_factory.AbstractFactory;
import org.example.AbstractFactory_design_pattern.objects.Car;
import org.example.AbstractFactory_design_pattern.objects.LuxuryCar1;
import org.example.AbstractFactory_design_pattern.objects.LuxuryCar2;

public class LuxuryCarFactory implements AbstractFactory {
    @Override
    public Car getInstance(int price) {
        if(price>=1000000 && price<=20000000){
            return new LuxuryCar1();
        }
        if(price>20000000){
            return new LuxuryCar2();
        }
        return null;
    }
}
