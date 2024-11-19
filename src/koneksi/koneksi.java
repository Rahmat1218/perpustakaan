/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author RANUHI
 */
public class koneksi {
    private Connection koneksi;
    
    public Connection connect(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Alhamdulillah Berhasil");
        }catch(ClassNotFoundException e){
            System.out.println("O OW Gagal Koneksi"+e);
        }
        
        String url="jdbc:mysql://localhost3306/perpustakaan";
        try{
            koneksi = DriverManager.getConnection(url, "root", "");
        } catch(SQLException e){
            System.out.println("O OWWWW Gagal Database"+e);
        }
        return koneksi;
    }
}
   
