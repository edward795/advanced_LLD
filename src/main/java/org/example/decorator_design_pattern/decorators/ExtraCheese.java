package org.example.decorator_design_pattern.decorators;

import org.example.decorator_design_pattern.base_layers.BasePizza;

public class ExtraCheese extends ToppingDecorator {

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
}
