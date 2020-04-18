package com.akhtar.pizza.menu;

import com.akhtar.pizza.interfaces.Command;

import java.util.Scanner;

public class PizzaPreparationMenu implements Command {
    Scanner sc=new Scanner(System.in);
    @Override
    public void execute() {
        System.out.println("Choose from following options");
        System.out.println("Option 1: Choose a pizza preparation");
        System.out.println("Option 2: Make your own pizza");
        switch (sc.nextInt())
        {
            case 1: System.out.println("Choose from following types");
                System.out.println("1.PizzaA 2. PizzaB C. PizzaC D. PizzaD"); break;

            case 2: System.out.println("Enter recipe");
                System.out.println("1.PizzaA 2. PizzaB C. PizzaC D. PizzaD");
        }
    }
}
