import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Scanner;

public class Java8DateTime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your DOB(mm-dd-yyyy)");
        String dob=s.nextLine();
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(dob,dtf);
        System.out.println(ldt);
        //System.out.println(ldd);
        //        LocalDate ld=LocalDate.of(2000,8,24);
//        System.out.println(ld);
//        LocalTime lt=LocalTime.of(21,30,59);
//        System.out.println(lt);
//        LocalDateTime ldt = LocalDateTime.now();
//        System.out.println(ldt);
    }
}
