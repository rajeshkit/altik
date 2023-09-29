package polymorphism;

import java.util.Scanner;

public class PaymentGateway extends PaymentType  {
    @Override
    public boolean billPayment(String Upi){
        System.out.println("ask for upi id");
        System.out.println("amout");
        System.out.println("approve or pay");
        System.out.println("pin number");
        return  true;

    }
    public static void main(String[] args) {
        int a=46;
        PaymentType pay=new PaymentGateway();
        pay.billPayment("Dfdf");






    }






}
