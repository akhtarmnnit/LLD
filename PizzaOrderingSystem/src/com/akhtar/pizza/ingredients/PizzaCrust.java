package com.akhtar.pizza.ingredients;

import com.akhtar.pizza.interfaces.PizzaIngredientsTemplate;
import com.akhtar.pizza.interfaces.PizzaIngredientsTemplate;

public abstract class PizzaCrust implements PizzaIngredientsTemplate {
    @Override
    public int getCost() {
        return 0;
    }
}
