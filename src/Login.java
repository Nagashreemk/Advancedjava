import java.sql.DriverManager;
import java.sql.Connection;
public class Login {
    public static void main(String[] args) {
        Connection con=null;
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","0");
            if(con!=null){
                System.out.println("Database connected");
            }
        }catch(Exception e){
            System.out.println("Not connected");
        }
    }
    
}
