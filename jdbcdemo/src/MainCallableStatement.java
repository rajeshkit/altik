import java.sql.*;

public class MainCallableStatement {
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
            CallableStatement cstmt= con.prepareCall("{?=CALL demo()}");
            cstmt.registerOutParameter(1,Types.VARCHAR);
            cstmt.execute();
          System.out.println(cstmt.getString(1));
//           CallableStatement cstmt = con.prepareCall("{CALL getEmployeeSalaryById(?,?,?)}");
//            cstmt.setInt(1,7000);
//            cstmt.registerOutParameter(2,Types.INTEGER);
//            cstmt.registerOutParameter(3,Types.NVARCHAR);
//            cstmt.execute();
//            System.out.println(cstmt.getInt(2));
//            System.out.println(cstmt.getString(3));
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



