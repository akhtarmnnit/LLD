public class PowerButton implements ToggleButton{

    Boolean isSystemOn;
    PowerButton()
    {
        isSystemOn=false;
    }
    @Override
    public void pressButton() {
        if(isSystemOn==true)
            System.out.println("System PoweredOn");
        else
            System.out.println("System PoweredOff");
    }
}
