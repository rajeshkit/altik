import java.util.ArrayList;

public class Demo<T> {
    T i;

    public T add() {
        return i;
    }

    public void add(T i) {
        this.i = i;
    }

    public static void main(String[] args) {

        Demo<String> d=new Demo<>();
        d.add("Rajesh");
        d.add("sdfsdf");

    }
}
