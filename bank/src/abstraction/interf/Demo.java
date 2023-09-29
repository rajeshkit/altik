package abstraction.interf;

import com.sun.security.jgss.GSSUtil;

enum Days{
    SUNDAY,MONDAY,TUESDAY,FRIDAY;
}
public class Demo {
    public static void main(String[] args) {
        Days d1 = Days.FRIDAY;
        System.out.println(d1);
        System.out.println(Days.FRIDAY.ordinal());
        Days[] days=Days.values();
        for (Days d:days) {
            System.out.println(d);
        }
    }
}
