import java.sql.Types;
import java.util.Comparator;

public class Demo {
    void display(){

    }
    static void show(){

    }
    public static void main(String[] args) {
        Runnable r;
        Comparable b;
        Comparator cc;
        System.out.println("Enter the day");
        Days d = Days.SUNDAY;
        System.out.println(d);

        for (Days day:Days.values()) {
            System.out.println(day.toString());
        }

        String s = "Thursday";
        Days dd=Days.valueOf(s);
    }
}
