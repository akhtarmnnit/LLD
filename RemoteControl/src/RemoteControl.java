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
        prepare();
    }
    void prepare()
    {
        buttonMap.put(ButtonType.CHANNEL_BUTTON,new ChannelButton());
        buttonMap.put(ButtonType.MIC_BUTTON,new MicButton());
        buttonMap.put(ButtonType.MUTE_BUTTON,new MuteButton());
        buttonMap.put(ButtonType.OK_BUTTON,new OKButton());
        buttonMap.put(ButtonType.POWER_BUTTON,new PowerButton());
        buttonMap.put(ButtonType.NAVIGATOR_BUTTON,new NavigatorButton());
    }
    void pressPowerButton()
    {
        
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
    void displayRemote()
    {
        for(ButtonType buttonType: buttonMap.keySet())
        {
            System.out.println(buttonType.toString());
        }
    }

    public void pressButton(String input) {
        Button button = buttonMap.get(input);

    }
}
