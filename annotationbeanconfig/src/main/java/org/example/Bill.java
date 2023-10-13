package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Bill {

    private Payment payment;
    @Autowired
    public Bill(Payment payment) {
        this.payment = payment;
    }

    public void payBill(){
        System.out.println("pay bill ");
    }
}
