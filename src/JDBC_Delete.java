import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBC_Delete {

    
    public static void main(String[] args) {
    String jdbcUrl = "jdbc:mysql://localhost:3306/emp";
    String username = "root";
    String password = "";
    String sql = "delete from employee where emp_id=1";

    try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password); 
        Statement stmt = conn.createStatement();) {
      
      stmt.executeUpdate(sql);
      System.out.println("Record deleted successfully");
    } catch (SQLException e) {
      e.printStackTrace();
    }
    }
}
