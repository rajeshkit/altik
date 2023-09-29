import java.util.*;

public class Main{
    public static void main(String[] args) {
//        ArrayList<Scanner> al=new ArrayList<>();
//        String
//        al.add(new Scanner(System.in));
//        al.add(new Scanner(System.in));
//        al.add(new Scanner(System.in));
//        System.out.println(al);
//        Collections.sort(al);
//        System.out.println(al);
        ArrayList<Trainee> al1=new ArrayList<>();
        al1.add(new Trainee(12,"abc"));
        al1.add(new Trainee(565,"bcd"));
        al1.add(new Trainee(67,"def"));
        for (Trainee o : al1){
            System.out.println(o) ;
        }
        Collections.sort(al1);
        System.out.println("After sort");
        for (Trainee o : al1){
            System.out.println(o) ;
        }
    }
}