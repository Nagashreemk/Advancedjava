import java.sql.*;
public class InsertDEmo {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "Nagashreemk";
   static final String dbName = "jdbctest1";
    public static void main(String[] args) {
        Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL+dbName,USER,PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      
      String sql = "INSERT INTO employee " +
                   "VALUES ('1', '30', 'Nagashree', 'Mk','Mysore')";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO employee " +
                   "VALUES ('2', '34', 'Manya', 'k','Banglore')";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO employee " +
                   "VALUES ('3', '33', 'Sandeep', 'kp','Belagavi')";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO employee " +
                   "VALUES ('4', '43', 'Kamalesh', 'B','Gadag')";
      stmt.executeUpdate(sql);
      
      sql = "UPDATE employee " +
                   "SET age = 40 WHERE empno in (2,3)";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");
      
      String sql2="DELETE FROM  employee where empno=4";
       stmt.executeUpdate(sql2);
      System.out.println("deleted records in the table where empno is 4...");
     ResultSet rs= stmt.executeQuery("select * from employee");
     while(rs.next()){
         System.out.println(rs.getString(1)+ " "+rs.getString(2)+ " "+rs.getString(3)+ " "+rs.getString(4)+ " "+rs.getString(5)+" ");
     }
      
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
    }
    
}
