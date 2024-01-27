/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQLConnection;
import java.sql.*;
/**
 *
 * @author jhawa
 */
public class SQL_Connection {
    public static Connection getCon(){
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Gym_Management_System","root","root1234");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
}
