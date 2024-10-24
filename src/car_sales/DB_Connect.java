/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car_sales;
import java.sql.*;

public class DB_Connect {
  public static void main( String args[] ) {
      
      Connection c = null;
 
      try {
       
        Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:Car_Sale_DB.db");
         c.setAutoCommit(false);
         System.out.println("Opened database successfully");
         
         c.commit();
         c.close();
     
      } 
      catch ( Exception e ) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);
      }
      
   }
}