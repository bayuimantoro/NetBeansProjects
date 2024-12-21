package modul6;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi {
    Connection con;
    
    public koneksi(){
        String Id, Pass, Driver, Url;
        Id = "root";
        Pass = "";
        Driver = "com.mysql.cj.jdbc.Driver";
        Url = "jdbc:mysql://localhost:3306/db_mhs";
        
        try{
            Class.forName(Driver).newInstance();
            con = DriverManager.getConnection(Url, Id, Pass);
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } catch (Exception e){
            System.out.println(""+e.getLocalizedMessage());
        }
    }
    public static void main(String[]args){
        koneksi k = new koneksi();
    }
}