public class AmericanPlug implements ThinPlug {
    AmericanPlug(){

    }

    @Override
    public void fitIntoThinSlot() {
        System.out.println("I am an american plug suitable to be used as thin plug");
    }
}
