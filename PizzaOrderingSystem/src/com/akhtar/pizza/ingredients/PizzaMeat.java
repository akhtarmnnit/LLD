package com.akhtar.pizza.ingredients;
import com.akhtar.pizza.interfaces.PizzaIngredientsTemplate;

public class PizzaMeat implements PizzaIngredientsTemplate {
    IngredientCost ingredientCost;
    PizzaMeat(IngredientCost iCost)
    {
        ingredientCost=iCost;
    }

    @Override
    public String getName() {
        return ingredientCost.name;
    }

    @Override
    public int getCost() {
        return ingredientCost.cost;
    }
}
