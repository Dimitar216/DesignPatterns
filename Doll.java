public class Doll extends Product {
    @Override
    public void prepare() {
        setType("Doll");
        MagicBoard.print(getType());
    }
}
