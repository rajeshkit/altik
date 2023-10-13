package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class Bill{
    private Payment payment;

    public Bill(Payment payment) {
        this.payment = payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void payBill(){
        System.out.println("pay bill ");
       // pay.makePayment();
    }
}
