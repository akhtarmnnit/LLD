public class NavigatorButton implements FourDirectionButton {

    @Override
    public void pressUp() {
        System.out.println("Go Up");
    }

    @Override
    public void pressDown() {
        System.out.println("Go Down");
    }

    @Override
    public void pressLeft() {
        System.out.println("Go Left");
    }

    @Override
    public void pressRight() {
        System.out.println("Go Right");

    }

    public ButtonClass buttonClass()
    {
        return ButtonClass.FourDirectionButton;
    }
}
