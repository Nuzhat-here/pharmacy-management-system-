/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author USER
 */
public class dbConnection {
    private static final String username = "root";
    private static final String password = "root123";
    private static final String dataConn = "jdbc:mysql://localhost:3306/pharma";
    private static Connection con  = null;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dataConn,username, password);
        } catch (Exception ex) {
           System.out.println(ex.getMessage());
        }
        return con;
    }
    
}
