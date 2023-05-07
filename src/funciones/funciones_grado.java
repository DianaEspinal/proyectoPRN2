/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;
import prn215_grupo_4_1.frmGrado;
import Clases.Colegio.*;
import java.sql.*;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class funciones_grado extends Conexion {
    
    public boolean agregarGrado(Grado agregar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        //String sqlVerify = "SELECT * FROM WHERE id = ?";
        String sql = "INSERT INTO grado(idGrado, grado) VALUES (?, ?)";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, agregar.getCodigoGrado());
            ps.setString(2, agregar.getGrado());
            ps.execute();
            return true;
            
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede repetir el codigo de un grado");
            System.out.println(e);
            return false;
        } 
        finally
        {
            try {
                con.close();                
            } catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    public boolean actualizarGrado(Grado actualizar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        String sql = "UPDATE grado SET grado = ? WHERE idGrado = ?";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, actualizar.getGrado());
            ps.setString(2, actualizar.getCodigoGrado());            
            ps.execute();
            return true;
            
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } 
        finally
        {
            try {
                con.close();                
            } catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
     public boolean borrarGrado(Grado borrar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        String sql = "DELETE FROM grado WHERE idGrado = ?";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, borrar.getCodigoGrado());            
            ps.execute();
            return true;
            
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } 
        finally
        {
            try {
                con.close();                
            } catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
     
     
}


