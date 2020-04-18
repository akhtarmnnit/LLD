public class VolumeButton implements UpDownButton {

    int volume=0;
    private static final int MAX_VOLUME = 50;
    @Override
    public void pressUp() {
        volume++;
    }

    @Override
    public void pressDown() {
        volume--;

    }
}
