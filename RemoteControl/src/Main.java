import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Hello World!");
        RemoteControl remote = new RemoteControl();
        while (true)
        {
            System.out.println("Choose your options by entering the button. Enter EXIT to exit");
            remote.displayRemote();
            String input=sc.nextLine();
            if(input.equals("EXIT"))
            {
                break;
            }
            remote.pressButton(input);

        }
    }
}
