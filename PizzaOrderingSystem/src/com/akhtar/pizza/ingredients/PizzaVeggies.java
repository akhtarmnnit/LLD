package com.akhtar.pizza.ingredients;

import com.akhtar.pizza.interfaces.PizzaIngredientsTemplate;


public abstract class PizzaVeggies implements PizzaIngredientsTemplate {
    String name;
    int cost;
    PizzaVeggies(String veggieName, int veggieCost)
    {

    }
    @Override
    public int getCost() {
        return 0;
    }
}
