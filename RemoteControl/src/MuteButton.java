public class MuteButton implements ToggleButton {
    Boolean isMute;
    MuteButton()
    {
        isMute=false;
    }
    @Override
    public void pressButton() {
        if(isMute==false)
            isMute=true;
        else
            isMute=false;
    }
}
