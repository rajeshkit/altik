public class InvalidCardNumberException  extends Exception{
    String msg;

    public InvalidCardNumberException(String message) {
        super(message);
    }
}
