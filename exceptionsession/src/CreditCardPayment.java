import java.util.Scanner;

public class CreditCardPayment {
    public static void main(String[] args) {
        String info="card number invalid";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the card number");
        String cardNumebr = s.next();

        if(cardNumebr.length()!=16){
            try {
                throw new InvalidCardNumberException(info);
            } catch (InvalidCardNumberException e) {
                System.out.println("Check the credit card number");
                e.printStackTrace();
            }
        }else{
            System.out.println("Transaction is success");
        }
    }
}
