import java.util.*;

public class RemoteControl {
    boolean isSystemOn;
    Map<ButtonType, Button> buttonMap;
    void addButton(ButtonType buttonType,Button button)
    {
        try {
            buttonMap.put(buttonType, button);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    RemoteControl()
    {
        isSystemOn=false;
        buttonMap=new HashMap<>();
    }
    void prepare()
    {
        buttonMap.put(ButtonType.CHANNEL_BUTTON,new ChannelButton());
    }
    void pressPowerButton()
    {
        isSystemOn=!isSystemOn;
        if(isSystemOn==true)
            System.out.println("System PoweredOn");
        else
            System.out.println("System PoweredOff");
    }
    void increaseVolumeButton()
    {
        System.out.println("Volume increased to");
    }
    void decreaseVolumeButton()
    {
        System.out.println("Volume increased to");
    }
    void pressMute()
    {

    }
}
