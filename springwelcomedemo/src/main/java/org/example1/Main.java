package org.example1;

import org.example.Staff;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac=
                new ClassPathXmlApplicationContext("beans.xml");
            InternetBill ib=ac.getBean(InternetBill.class);
            ib.display();
            ((AbstractApplicationContext)ac).close();




    }
}