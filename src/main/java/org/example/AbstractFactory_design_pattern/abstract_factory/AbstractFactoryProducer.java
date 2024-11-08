package org.example.AbstractFactory_design_pattern.abstract_factory;

import org.example.AbstractFactory_design_pattern.factory.EconomicCarFactory;
import org.example.AbstractFactory_design_pattern.factory.LuxuryCarFactory;

public class AbstractFactoryProducer {
    public AbstractFactory getFactoryInstance(String value) {
        if (value.equals("Economic")) {
            return new EconomicCarFactory();
        } else if (value.equals("Luxury") || value.equals("Premium")) {
            return new LuxuryCarFactory();
        }
        return null;
    }
}
