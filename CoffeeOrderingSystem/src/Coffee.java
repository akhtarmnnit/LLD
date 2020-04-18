public class Coffee {
    private String name;
    private double cost;
    private String description;
    Coffee(String name, double cost, String description)
    {
        this.name=name;
        this.cost=cost;
        this.description=description;
    }
    public String getName()
    {
        return name;
    }
    public double getCost()
    {
        return cost;
    }
    public String getDescription()
    {
        return description;
    }

}
