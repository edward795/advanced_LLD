package org.example.decorator_design_pattern.decorators;

import org.example.decorator_design_pattern.base_layers.BasePizza;

public class Mushroom extends ToppingDecorator {

    BasePizza basePizza;

    Mushroom(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+15;
    }
}
