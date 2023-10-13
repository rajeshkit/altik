package di1;

public class Airtel {
    Payment p;
    Object c;

    public Airtel(Payment p) {
        this.p = p;
    }

    public void recharge(){

      p.makePayment();
    }
}
