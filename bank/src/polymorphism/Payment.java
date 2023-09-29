package polymorphism;

public class Payment {
    public boolean billPayment(String amount){
        System.out.println("Represntative will visit our address");
        System.out.println("collect the cash");
        System.out.println("Reciept");
        System.out.println("done");
        return  true;
    }
    public boolean billPayment(int amount,String upi){
        System.out.println("ask for upi id");
        System.out.println("amout");
        System.out.println("approve or pay");
        System.out.println("pin number");
        return  true;
    }
    public boolean billPayment(String onlineBanking,int amount){
        System.out.println("enter the username and password");
        System.out.println("amout");
        System.out.println("OTP");
        System.out.println("payment");

        return  true;
    }
    public boolean billPayment(String cardType,int amount,int cardNumber){
        System.out.println("enter the username and password");
        System.out.println("amout");
        System.out.println("OTP");
        System.out.println("payment");
        return  true;
    }

    public static void main(String[] args) {
           Payment pay=new Payment();
          // pay.billPayment(4556);
    }












}
