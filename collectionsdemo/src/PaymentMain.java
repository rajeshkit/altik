import java.util.ArrayList;
import java.util.Collections;

public class PaymentMain {
    public static void main(String[] args) {
        Payment p1=new Payment(12,6767,"SBI");
        Payment p2=new Payment(1323,3434,"SBI");
        Payment p3=new Payment(23,34777,"ICICI");
        Payment p4=new Payment(187,6767,"HDFC");
        Payment p5=new Payment(7,9998,"CANARA");
        ArrayList<Payment> list=new ArrayList<>();
        list.add(p1);
        list.add(p4);
        list.add(p3);
        list.add(p5); list.add(p2);
        System.out.println("Before sort");
        for (Payment p:list) {
            System.out.println(p);
        }
        Collections.sort(list);
        System.out.println("After sort");
        for (Payment p:list) {
            System.out.println(p);
        }
        


    }
}






