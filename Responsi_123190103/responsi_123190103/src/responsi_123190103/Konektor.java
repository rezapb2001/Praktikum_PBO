/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi_123190103;

import java.sql.*;
/**
 *
 * @author ASUS
 */
public class Konektor {
    String DBurl = "jdbc:mysql://localhost/prakpbo";
    String DBusername = "root";
    String DBpassword = "";
    
    Connection koneksi;
    Statement statement;
    ResultSet rs;
    PreparedStatement pStatement = null;
    
    public Konektor(){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection(DBurl,DBusername,DBpassword);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            System.out.println("Koneksi gagal");
        }
    }
}
