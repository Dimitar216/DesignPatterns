public class Gnome {
    public Product createProduct(String product){
        if(product == null||product.isEmpty()){
            return null;
        }
        switch (product){
            case "Need Doll":
                return new Doll();
            case "Need Wheel":
                return new Wheel();
            default:
                throw new IllegalArgumentException("Unknown product "+product);
        }
    }
}
