package association;

public class Computer {
    public static void main(String[] args) {
        Computer c=new Computer();
        System.out.println(c.hashCode());
        c=null;
        System.out.println(c.hashCode());
    }
}
