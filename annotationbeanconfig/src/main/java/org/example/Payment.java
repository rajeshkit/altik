package org.example;

import org.springframework.stereotype.Component;

@Component
public class Payment {
    void makePayment(){
        System.out.println("payment is called and it is done");
    }
}
