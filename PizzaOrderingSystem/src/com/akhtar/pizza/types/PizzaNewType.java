package com.akhtar.pizza.types;

import com.akhtar.pizza.interfaces.Pizza;
import com.akhtar.pizza.interfaces.PizzaIngredientsTemplate;

import java.util.List;

public class PizzaNewType extends Pizza {
    public PizzaNewType(List<PizzaIngredientsTemplate> list) {
        super(list);
    }

    @Override
    public void create() {
        System.out.print("I m the newly introduced pizza");
    }
}
