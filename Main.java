public class Main {
    public static void main(String[] args) {
        String messageForProduction;
        Gnome gnome = new Gnome();
        FatherChristmas xmas = FatherChristmas.getInstance();

        xmas.updateMessage(NeedWheels.getNeed());
        messageForProduction = FatherChristmas.getToyMessage();
        Product wheelProduct = gnome.createProduct(messageForProduction);

        xmas.updateMessage(NeedDolls.getNeed());
        messageForProduction = FatherChristmas.getToyMessage();
        Product dollProduct = gnome.createProduct(messageForProduction);

        wheelProduct.prepare();
        dollProduct.prepare();
    }
}
