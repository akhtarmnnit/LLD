public class CoffeeCondiments
{
    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    String name;
    double cost;
    CoffeeCondiments(String name, double cost)
    {
        this.name=name;
        this.cost=cost;
    }
}