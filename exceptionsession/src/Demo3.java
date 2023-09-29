import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo3 {
    void display() throws ClassNotFoundException{

        Class.forName("");
        try {
            DriverManager.getConnection("");
        } catch (SQLException e) {

        }
    }
    public static void main(String[] args) {
        Demo3 d=new Demo3();
        try {
            d.display();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
