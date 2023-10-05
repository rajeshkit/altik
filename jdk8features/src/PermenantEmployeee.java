import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PermenantEmployeee {
    public static void main(String[] args) {
        Product pro1=new Product(8888,"Iron box");
        Product pro2=new Product(4555,"Metal box");
        Predicate<Product> p2=e->e.getProductId()>5000;
        System.out.println(p2.test(pro1));
        System.out.println(p2.test(pro2));


        Predicate<Integer> p= e-> e>0;
        System.out.println(p.test(-4545));//false
        System.out.println(p.test(45456));//true
        System.out.println(p.test(-2));//false

          Predicate<String> p1=(String e)->{return e.equals("Chennai");};
          boolean answer = p1.test("Chennai");
          System.out.println(answer);
          //        T  ,   R
        Function<Integer,String> fun=(Integer e)->{return e+" chennai";};
        System.out.println(fun.apply(1234));

        Function<Byte,Boolean> fun1=(Byte e)->{return e>0;};
        System.out.println(fun1.apply((byte)20));

        Consumer<Float> c=e->System.out.println(e);
        c.accept(5454.6f);
        Consumer<Product> cc=(Product e)->{
            System.out.println(e);
        };













    }

}
