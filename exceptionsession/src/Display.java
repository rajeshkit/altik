public class Display {
    void display() {
        System.out.println("line 1");
        int k=100/0;// jvm ArithmeticException a=new ArithmeticException();
        //throw a;
        System.out.println("line 2");
    }
}
