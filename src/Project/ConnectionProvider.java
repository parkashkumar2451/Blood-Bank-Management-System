
package Project;
import java.sql.*;
public class ConnectionProvider {
    public static Connection getCon() throws ClassNotFoundException, SQLException{
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root","@ComputerScience");
             return con;
             
         }
         catch(Exception e){
             return null;
         }
    }
}
