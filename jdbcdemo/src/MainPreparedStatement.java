import java.sql.*;

public class MainPreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException{
        String url="jdbc:mysql://localhost:3306/altimetrik";
        String username="root";
        String password="root@123";
        String insertQuery = "INSERT INTO employee VALUES(?,?,?,?)";
        String updateQuery="UPDATE employee SET name=?,salary=? WHERE id=?";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = null;
        int result = 0;
        try {
            con = DriverManager.getConnection(url,username,password);
            PreparedStatement pstmt =
                    con.prepareStatement("DELETE FROM employee WHERE id=?");
                    pstmt.setInt(1,300);
            result = pstmt.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Employee details not registered !!! failure");
        }

        if(result!=0){
            System.out.println("Employee details registered successfully"+result);
        }
    }
}

//   pstmt.setString(1,"smiriti");
//           pstmt.setInt(2,100000);
//           pstmt.setInt(3,7000);

//            pstmt.setInt(1,6767);
//            pstmt.setString(2,"Willson");
//            pstmt.setString(3,"wilson@gmail.com");
//            pstmt.setInt(4,70000);



