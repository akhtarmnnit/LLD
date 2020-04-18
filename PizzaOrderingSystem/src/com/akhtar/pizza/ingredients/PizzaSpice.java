package com.akhtar.pizza.ingredients;

import com.akhtar.pizza.interfaces.PizzaIngredientsTemplate;

public abstract class PizzaSpice implements PizzaIngredientsTemplate {
    @Override
    public int getCost() {
        return 0;
    }
}
