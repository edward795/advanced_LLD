package org.example.AbstractFactory_design_pattern;

import org.example.AbstractFactory_design_pattern.abstract_factory.AbstractFactory;
import org.example.AbstractFactory_design_pattern.abstract_factory.AbstractFactoryProducer;
import org.example.AbstractFactory_design_pattern.objects.Car;

public class Main {
    public static void main(String[] args) {
        AbstractFactoryProducer abstractFactoryProducer=new AbstractFactoryProducer();
        AbstractFactory abstractFactoryObj= abstractFactoryProducer.getFactoryInstance("Premium");
        Car carObj=abstractFactoryObj.getInstance(5000000);
        System.out.println("Top Speed of car : "+carObj.getTopSpeed());
    }
}
