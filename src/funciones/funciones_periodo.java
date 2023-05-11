/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;
import Clases.Colegio.*;
import java.sql.*;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class funciones_periodo extends Conexion {
    
    public boolean agregarPeriodo(Periodo agregar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        //String sqlVerify = "SELECT * FROM WHERE id = ?";
        String sql = "INSERT INTO periodo(idPeriodo, numeroPeriodo) VALUES (?, ?)";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, agregar.getCodigoPeriodo());
            ps.setInt(2, agregar.getNumeroPeriodo());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Periodo agregado correctamente");
            return true;
            
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede repetir el codigo de un periodo", "Advertencia",JOptionPane.WARNING_MESSAGE);
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
    
    public boolean actualizarPeriodo(Periodo actualizar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        String sql = "UPDATE periodo SET numeroPeriodo = ? WHERE idPeriodo = ?";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, actualizar.getNumeroPeriodo());
            ps.setString(2, actualizar.getCodigoPeriodo());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Periodo actualizado correctamente");
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
    
     public boolean borrarPeriodo(Periodo borrar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        String sql = "DELETE FROM periodo WHERE idPeriodo = ?";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, borrar.getCodigoPeriodo());            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Periodo eliminado correctamente");
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
