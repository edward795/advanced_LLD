package org.example.decorator_design_pattern;

import org.example.decorator_design_pattern.base_layers.BasePizza;
import org.example.decorator_design_pattern.base_layers.Margherita;
import org.example.decorator_design_pattern.decorators.ExtraCheese;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza=new ExtraCheese(new Margherita());
        System.out.println("Total Cost of the pizza is : "+pizza.cost());
    }
}
