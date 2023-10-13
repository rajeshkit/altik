import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException{
        String url="jdbc:mysql://localhost:3306/altimetrik";
        String username="root";
        String password="root@123";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = null;
        int result = 0;
        try {
            con = DriverManager.getConnection(url,username,password);
            Statement stmt = con.createStatement();
            //result = stmt.executeUpdate("INSERT INTO employee VALUES(7000,'rahul','rahul@gmail.com',3477)");
          //  result = stmt.executeUpdate("UPDATE employee SET salary=10000,name='rrr',email='rrr@gmail.com' WHERE id=234");
               ResultSet rs= stmt.executeQuery("SELECT * FROM employee");
               ResultSetMetaData rsm = rs.getMetaData();

                List<Employee> list=new ArrayList<>();
              while(rs.next()) {
                  Employee e=new Employee();
                  e.setId(rs.getInt(1));
                  e.setName(rs.getString(2));
                 e.setEmail(rs.getString(3));
                 e.setId(rs.getInt(4));
                 list.add(e);
              }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Employee details not registered !!! failure");
        }

        if(result!=0){
            System.out.println("Employee details registered successfully"+result);
        }
    }
}







