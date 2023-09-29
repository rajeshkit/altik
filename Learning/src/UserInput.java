import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the customer name");
        String name=s.nextLine();
        System.out.println("Enter the loan amount");
        int loanAmount=s.nextInt();
        System.out.println("Enter the tenure");
        int tenure=s.nextInt();
        System.out.println("Enter the rate of interest");
        float roi =  s.nextFloat();

        EmiDetails emi=new EmiDetails(loanAmount,name,roi,tenure);
        EmiDetails emi1=new EmiDetails(30000,"vijay",10.0f,2);
        EmiCalculator calculator=new EmiCalculator();

        float finalEmi=calculator.calculateEmi(emi);//30303030
        System.out.println("Your Monthly EMI is:"+finalEmi);


//        float finalEmi=calculator.calculateEmi(loanAmount,roi,tenure); // pass by value
//        System.out.println("Your Monthly EMI is:"+finalEmi);












    }
}
