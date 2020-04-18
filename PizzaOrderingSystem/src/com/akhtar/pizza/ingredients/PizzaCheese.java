package com.akhtar.pizza.ingredients;

import com.akhtar.pizza.interfaces.PizzaIngredientsTemplate;

public abstract class PizzaCheese implements PizzaIngredientsTemplate
{
    IngredientCost ingCost;
    PizzaCheese(IngredientCost ingCost)
    {

    }
    @Override
    public int getCost() {
        return ingCost.cost;
    }
}
