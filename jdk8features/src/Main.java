import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.Comparator;


interface Altimetrik{
        void payroll();

}
public class Main {
    public static void main(String[] args) {
        Altimetrik alt=() -> System.out.println("Payroll implementation");
        alt.payroll();
        Runnable r=() -> System.out.println("Thread task"+Thread.currentThread().getName());
        r.run();
        Comparator<Integer> c=(o1, o2)->o1.intValue() - o2.intValue();
        c.compare(45,88);


    }


}