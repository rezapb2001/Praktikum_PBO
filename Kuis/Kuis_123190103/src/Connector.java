
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Connector {
    String DBurl = "jdbc:mysql://localhost/prakpbo";
    String DBusername = "root";
    String DBpassword = "";
    
    Connection koneksi;
    Statement statement;
    ResultSet rs;
    PreparedStatement pStatement = null;
    public Connector(){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection(DBurl,DBusername,DBpassword);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            System.out.println("Koneksi gagal");
        }
    }
}
