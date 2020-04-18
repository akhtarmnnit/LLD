package com.akhtar.pizza.types;
import com.akhtar.pizza.interfaces.Pizza;
import com.akhtar.pizza.interfaces.PizzaIngredientsTemplate;
import com.akhtar.pizza.interfaces.PizzaIngredientsTemplate;

import java.util.*;

public class PizzaA extends Pizza {
    PizzaA(List<PizzaIngredientsTemplate> inputIngredientsList)
    {
        super(inputIngredientsList);
    }
    @Override
    public void create() {
        System.out.println("Create Pizza type A");
    }

}
