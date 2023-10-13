package di;

public class Airtel {
    private Payment payment;

    public Airtel(Payment payment) {
        this.payment = payment;
    }

    public void recharge(){
         payment.cardPayment();
    }
}
