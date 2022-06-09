public class FatherChristmas {
    private static FatherChristmas instance;
    private static String toyMessage;

    private FatherChristmas() {
        // TODO Auto-generated constructor stub
    }

    public static FatherChristmas getInstance() {

        if(instance == null) {
            instance = new FatherChristmas();
        }

        return instance;
    }

    public void updateMessage(String message) {
        toyMessage = message;
    }


    public static String getToyMessage() {
        return toyMessage;
    }
}
