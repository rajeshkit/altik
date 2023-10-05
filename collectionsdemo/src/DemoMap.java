import java.util.HashMap;

public class DemoMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap();
        hm.put(600000,"Tamilnadu");
        hm.put(500000,"Bangalore");
        hm.put(700000,"AP");
        hm.put(800000,"Kerala");
        hm.put(900000,"MP");
        System.out.println(hm.get(8765432));
        System.out.println(hm.entrySet());
        System.out.println(hm.keySet());
        System.out.println(hm.values());



    }
}
