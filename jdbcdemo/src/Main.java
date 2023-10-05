import java.sql.*;

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


              while(rs.next()) {
                  System.out.println(rs.getInt(1));
                  System.out.println(rs.getString(2));
                  System.out.println(rs.getString(3));
                  System.out.println(rs.getInt(4));
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







