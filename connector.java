import java.sql.Connection;
import java.sql.DriverManager;
public class connector {
    public static void main(String[]args){
  String url ="jdbc:mysql://localhost:3306/world";
  try
  {Connection myConnection=null;
    myConnection=DriverManager.getConnection(url, "root", "root");
    if (myConnection==null)
    System.out.println("no connection");
    else
    System.out.println("connection");
  }
  catch (Exception e) {
    e.printStackTrace();
    }
}}
