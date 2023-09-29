import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo1 {
    void display() throws ClassNotFoundException, FileNotFoundException {
        int[] a={34,55,54};
        System.out.println("line 1");
        FileReader fr=new FileReader("c:/test.txt");
     //   ClassNotFoundException ex=new ClassNotFoundException();
     //  ArithmeticException ex=new ArithmeticException();
     //   throw ex;
    }
    void calculator() throws ClassNotFoundException, FileNotFoundException {
        System.out.println("line 1");
        display();
        System.out.println("line 2");
    }

    public static void main(String[] args) {
        Demo1 d=new Demo1();
        try {
            d.calculator();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
