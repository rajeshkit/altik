import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the account holder name");
        String name=s.nextLine();
        System.out.println("Enter the account number");
        int accNo=s.nextInt();
        System.out.println("Enter your account balance");
        float accBalance=s.nextFloat();
        Account a1=new Account(accNo,name,accBalance);
        Loan loan=new Loan();
        loan.getAccountDetails(a1);
    }
}
