/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Colegio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Conexion {
    String db = "escueladb";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection con;
    
    public Conexion()
    {
    }
    
    public Connection conectar()
    {        
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url + db, user, password);
               JOptionPane.showMessageDialog(null, "Conexión exitosa a la base");
        } catch (ClassNotFoundException |SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la conexión de la base" + e.toString());
            //Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e); e
        }
        
        return con;
    }
}
