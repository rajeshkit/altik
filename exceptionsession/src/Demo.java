import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int[] arr=new int[3];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numerator");
        int numerator=s.nextInt();
        System.out.println("Enter the denominator");
        int denominator=s.nextInt();
        System.out.println("Line 1");
        System.out.println("Line 2");
        System.out.println("Line 3");

            int k = numerator / denominator;
            arr[8]=34;// jvm internally ArrayIndexOutOfBoundsException ac=new ArrayIndexOutOfBoundsException();
            //thorw ac;
            System.out.println(k);

        System.out.println("Line 4");
        System.out.println("Line 5");
        System.out.println("Line 6");

    }
}
