public class Main {

    public static void main(String[] args) {

        System.out.println("Adapter Demo");
        SolidPlug britishPlug = new BritishPlug();
        ThinPlug americanPlug = new AmericanPlug();
        ThinToSolidAdapter plug=new ThinToSolidAdapter(americanPlug);
        plug.fitIntoSolidSlot();
    }
}
