public enum ButtonType {
    POWER_BUTTON("Power"),CHANNEL_BUTTON("Channel"),OK_BUTTON("OK"),
    NAVIGATOR_BUTTON("NAVIGATOR"),VOLUME_BUTTON("VOLUME"),MUTE_BUTTON("MUTE"),MIC_BUTTON("MIC");
    String buttonType;
    ButtonType(String brand) {
        this.buttonType = buttonType;
    }

    @Override
    public String toString() {
        return buttonType;
    }
}
