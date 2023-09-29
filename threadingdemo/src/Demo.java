import java.util.*;

public class Demo {
    public static void main(String[] args) {
       ArrayList<Number> al=new ArrayList<>();
       String no="676 9834 343";
       String[] nos=no.split(" ");
       al.add(Integer.valueOf(nos[0]));
       al.add(Integer.valueOf(nos[1]));
        al.add(Integer.valueOf(nos[2]));

       al.add(45);
       al.add(7.8f);
       al.add(675);

       System.out.println(al);
        for (Object s:al) {
            System.out.println(s);
        }
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
