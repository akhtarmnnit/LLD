import java.util.*;
public class CoffeeInventory {
    List<Coffee> coffeeList;
    List<CoffeeCondiments> coffeeCondimentsList;
    private CoffeeInventory()
    {
        coffeeList = new ArrayList<>();
        coffeeCondimentsList = new ArrayList<>();
        init();
    }
    private void init()
    {
        initializeCoffee();
        initializeCoffeeCondiments();
    }
    private void initializeCoffee()
    {
        coffeeList.add(new Coffee("HouseBlend", 2.0,"A great house blend of coffee"));
        coffeeList.add(new Coffee("Decaf", 1.0,"That classic Decaf your Grandpa loves"));
        coffeeList.add(new Coffee("DarkRoast", 1.0,"Chicago style dark roast"));
        coffeeList.add(new Coffee("Espresso", 1.0,"That smooth new york espresso"));
    }
    private void initializeCoffeeCondiments()
    {
        coffeeCondimentsList.add(new CoffeeCondiments("SteamedMilk",2.0));
        coffeeCondimentsList.add(new CoffeeCondiments("Caramel",1.0));
        coffeeCondimentsList.add(new CoffeeCondiments("Whip",2.5));
        coffeeCondimentsList.add(new CoffeeCondiments("Mocha",2.0));
        coffeeCondimentsList.add(new CoffeeCondiments("Soy",1.0));
    }
    private static CoffeeInventory CoffeeInventoryInstance = new CoffeeInventory();
    public static CoffeeInventory getInstance() {
        return CoffeeInventoryInstance;
    }
    List<Coffee> getCoffeeTypes()
    {
        return coffeeList;
    }
    List<CoffeeCondiments> getCoffeeCondimentList()
    {
        return coffeeCondimentsList;
    }
    void listCoffeeMenu()
    {
        for(Coffee coffee:coffeeList)
        {
            System.out.println(coffee.getName()+":"+coffee.getDescription()+"  "+coffee.getCost());
            System.out.println();
        }
    }
    void listCoffeeCondimentsMenu()
    {
        for(CoffeeCondiments condiment:coffeeCondimentsList)
        {
            System.out.println(condiment.getName()+"  "+condiment.getCost());
            System.out.println();
        }
    }

}
