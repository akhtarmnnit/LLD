public class ThinToSolidAdapter implements SolidPlug{
    private ThinPlug thinPlug;
    ThinToSolidAdapter(ThinPlug thinPlug)
    {
        this.thinPlug = thinPlug;
    }

    @Override
    public void fitIntoSolidSlot() {
        thinPlug.fitIntoThinSlot();
    }
}
