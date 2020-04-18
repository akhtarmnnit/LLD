package com.akhtar.pizza.interfaces;

import java.util.List;

public abstract class Pizza implements PizzaTemplate{
    List<PizzaIngredientsTemplate> ingredientsList;
    public Pizza(List<PizzaIngredientsTemplate> list)
    {
        ingredientsList=list;
    }

    public abstract void create();//creation of pizza differs from pizza to pizza
    @Override
    public int getCost() {
        int sum=0;
        for(PizzaIngredientsTemplate ing:ingredientsList)
        {
            sum = sum + ing.getCost();
        }
        return sum;

    }
}
