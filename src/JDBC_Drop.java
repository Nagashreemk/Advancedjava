import java.sql.*;
public class JDBC_Drop {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost/";
    static final String USER = "username";
   static final String PASS = "";
    public static void main(String[] args) {
        Connection conn = null;
   Statement stmt = null;
   try{
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
       System.out.println("Deleting database...");
      stmt = conn.createStatement();
      
      String sql = "DROP DATABASE STUDENTS";
      stmt.executeUpdate(sql);
      System.out.println("Database deleted successfully...");
   }catch(SQLException se){
       se.printStackTrace();
   }catch(Exception e){
       e.printStackTrace();
   }finally{
 
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
   System.out.println("Goodbye!");
    }
    
}
