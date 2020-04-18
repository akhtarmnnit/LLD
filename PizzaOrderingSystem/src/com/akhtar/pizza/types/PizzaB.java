package com.akhtar.pizza.types;
import com.akhtar.pizza.interfaces.Pizza;
import com.akhtar.pizza.interfaces.PizzaIngredientsTemplate;

import java.util.List;

public class PizzaB extends Pizza {
    public PizzaB(List<PizzaIngredientsTemplate> list) {
        super(list);
    }

    @Override
    public void create() {
        System.out.println("Create Pizza type B");
    }

}
