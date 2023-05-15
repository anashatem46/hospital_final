/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
 
 //@author aanshatem

          public class appconnection {

    
     public Connection connection=null;
     public Connection getconConnection(){
        System.out.print("mysql Connection Testing\n");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://projectoop.mysql.database.azure.com:3306/hospital?","anashatem","waQha5-giqmus-topges");
            System.out.println("Driver Registered\n");
            if (connection !=null){
               System.out.println("You Made It");}
            else{
               System.out.println("Failed");}
                }
        catch(ClassNotFoundException ex){
                System.out.println("Where is MySql Driver");
                ex.printStackTrace();
            }
        catch(SQLException e)
            {
            System.out.println("Connection Field");
            e.printStackTrace();
            }
        return connection;
     }
    
}
