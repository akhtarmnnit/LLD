import java.util.Scanner;

public class Main {

    static CoffeeInventory coffeeInventory=CoffeeInventory.getInstance();
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Welcome to our coffee shop");
        System.out.println("**************************");
        System.out.println("Choose your coffee from below");
        coffeeInventory.listCoffeeMenu();
        int inputCoffee = sc.nextInt();
        String coffeeChosen=coffeeInventory.getCoffeeTypes().get(inputCoffee).getName();
        System.out.println("What all we should add to your "+coffeeChosen);
        coffeeInventory.listCoffeeCondimentsMenu();
        int i=0;
        while(sc.hasNextInt())
        {
            int choice = sc.nextInt();
            if(choice==-1)
                break;
            String condiment  = coffeeInventory.getCoffeeCondimentList().get(choice).getName();
            if(i==0)
            {
                coffeeChosen = coffeeChosen + "With" + condiment;
            }
            else
            {
                coffeeChosen = coffeeChosen + "And" + condiment;
            }
            i++;
        }
        //System.out.println("Coffee chosen:"+coffeeChosen);
        System.out.println("Your order for "+coffeeChosen+" is accepted");

    }
}
