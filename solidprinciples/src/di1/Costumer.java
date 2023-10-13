package di1;

import java.util.Scanner;

public class Costumer {
    public static void main(String[] args) {

        System.out.println("1. Card Payment");
        System.out.println("2. Online Banking");
        System.out.println("3. Upi payment");
        Scanner s=new Scanner(System.in);
        System.out.println("Eter the payment Method");
        int i=s.nextInt();
        if(i==1){
            CardPayment card=new CardPayment();
            Airtel a=new Airtel(card);
        }
        if(i==2){
            UpiPayment upi=new UpiPayment();
            Airtel a=new Airtel(upi);
        }
        if(i==3){
            OnlinePayment online=new OnlinePayment();
            Airtel a=new Airtel(online);
        }

    }
}
