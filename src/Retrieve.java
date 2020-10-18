import java.sql.*;
public class Retrieve {
    public static void main(String[] args) {
          String url = "jdbc:mysql://localhost:3306/";
		  String dbName = "student1";
		  String driver = "com.mysql.jdbc.Driver";
		  String userName = "root"; 
		 String password = "Nagashreemk";
		  try {
		  Class.forName(driver).newInstance();
		  Connection conn = DriverManager.getConnection(url+dbName,userName,password);
		  System.out.println("Database connected");
                  Statement stmt=conn.createStatement();
                  ResultSet rs=stmt.executeQuery("select * from  student3");
                  while(rs.next()){
                      System.out.println(rs.getString(1)+"" +rs.getString(3)+"" +rs.getString(4)+"" );
                  }
                  
		  conn.close();
		  } catch (Exception e) {
		  e.printStackTrace();
                  }

    }
    
}
