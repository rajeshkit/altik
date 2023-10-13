import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SQLDateMain {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your DOB(dd-mm-yyyy)");
        String dob=s.nextLine();
        System.out.println(dob);
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date d=sdf.parse(dob);
            System.out.println(d);
            java.sql.Date dd=new java.sql.Date(d.getTime());
            System.out.println(dd);
            SimpleDateFormat sdf1=new SimpleDateFormat("E, MMMM dd, yyyy");
            String str = sdf1.format(d);
            System.out.println(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}








