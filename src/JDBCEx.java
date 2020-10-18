import java.sql.*;
public class JDBCEx {
    public static void main(String[] args) {
          String url = "jdbc:mysql://localhost:3306/";
		  String dbName = "student2";
		  String driver = "com.mysql.jdbc.Driver";
		  String userName = "root"; 
		 String password = "nagashreemk";
		  try {
		  Class.forName(driver).newInstance();
		  Connection conn = DriverManager.getConnection(url+dbName,userName,password);
		  System.out.println("Database connected");
		  conn.close();
		  } catch (Exception e) {
		  e.printStackTrace();
                  }

    }
    
}
