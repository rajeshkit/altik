package org.example1;

public class InternetBill {
    private Payment payment;

    public InternetBill(Payment payment) {
        this.payment = payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    void display(){
        payment.displayPaymentMethod();
    }
}
