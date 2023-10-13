package di1;

public class CardPayment implements Payment{
    @Override
    public String makePayment() {
        return "Card Payment";
    }
}
