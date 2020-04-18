class ChannelButton implements UpDownButton {
    int channel = 1;
    private static final int MAX_CHANNEL=300;
    @Override
    public void pressUp() {
        if(channel==MAX_CHANNEL)
        {
            channel=0;//rewind
        }
        else {
            channel++;
        }
    }

    @Override
    public void pressDown() {
        if(channel==0)
            return;
        channel--;

    }
}
