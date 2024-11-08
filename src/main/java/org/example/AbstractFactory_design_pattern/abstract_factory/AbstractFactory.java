package org.example.AbstractFactory_design_pattern.abstract_factory;

import org.example.AbstractFactory_design_pattern.objects.Car;

public interface AbstractFactory {
    public Car getInstance(int price);
}
