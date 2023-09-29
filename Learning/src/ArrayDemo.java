import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] a={34,67,234,7}; // Array of primitive type
        String[] cities=new String[7];// Array f non primitive string type

        Trainee t1=new Trainee(); Trainee t2=new Trainee();
        Trainee t3=new Trainee();
        Trainee t4=new Trainee();
        Trainee[] traineeList={t1,t2,t3,t4};
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        for(int i :a){
            System.out.println(i);
        }

        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


























    }
}
