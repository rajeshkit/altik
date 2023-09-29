import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo4 {
    public static void main(String[] args) {
        int[] data={45,34,56,67};
        System.out.println("Line 1");
        try {
            int k=10/0;
            System.out.println(data[10]);
            FileReader fr=new FileReader("c:/test.txt");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally{

        }
        System.out.println("Line 2");
    }
}
