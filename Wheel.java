public class Wheel extends Product{
    @Override
    public void prepare() {
        setType("Wheel");
        MagicBoard.print(getType());
    }
}
