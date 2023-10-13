package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac=new AnnotationConfigApplicationContext(Beans.class);
        Bill b = ac.getBean(Bill.class);
        b.payBill();

    }
}
