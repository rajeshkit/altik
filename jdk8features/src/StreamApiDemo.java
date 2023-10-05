import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(456,41,67,45,8,9,3);
//        Predicate<Integer> p=e->e%2==0;
//        Consumer<Integer> c=e->System.out.println(e);

//        list.stream()
//                .filter(e->e%2==0)
//                .forEach(e->System.out.println(e));
        //Function<Integer,Integer> f=e->e*e;

        List<Integer> list1=list.stream()
                .map(e->e*e).filter(e->e%2!=0).sorted()
                .collect(Collectors.toList());

        System.out.println(list1);




    }

}
