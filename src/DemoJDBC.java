import java.sql.*;
public class DemoJDBC {

    public static void main(String[] args) {
        try{
        String Query="Select * from student3 where rollno=2";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student1", "root", "0" );
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(Query);
        rs.next();
        String sname=rs.getString(2);
        System.out.println(sname);
        System.out.println("Database Connected");
        con.close();
    }
        catch(Exception e){
            
        }
    
}
}
    