public class BritishPlug implements SolidPlug{
    BritishPlug(){

    }

    @Override
    public void fitIntoSolidSlot() {
        System.out.println("I can easily fit into a British socket");
    }
}
