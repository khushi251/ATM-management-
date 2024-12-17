package myconnection;
import java.sql.*;
public class OnlineConnection 
{
    static
    {
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver load");
    }
    catch(ClassNotFoundException e)
      {
        System.out.println(e);
      }     
    }
    public static Connection getConnection()
    {
        Connection con=null;
     try 
     {
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","root");
      //  System.out.println("Connection success"); 
     }
         catch(Exception e)
         {
             System.out.println(e);
         }
      return con;
    }
}
