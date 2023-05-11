/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;
import Clases.Colegio.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class funciones_grado extends Conexion {
    
    //Función para agregar un grado con datos validos a la base de datos con los datos ingresados en los txtFields
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
            JOptionPane.showMessageDialog(null, "Grado agregado correctamente");
            return true;
            
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede repetir el codigo de un grado", "Advertencia",JOptionPane.WARNING_MESSAGE);
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
    
    //Función para actualizar un grado con datos validos a la base de datos con los datos ingresados en los txtFields
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
            JOptionPane.showMessageDialog(null, "Grado actualizado correctamente");
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
    
    //Función para eliminar un grado    
     public boolean borrarGrado(Grado borrar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        String sql = "DELETE FROM grado WHERE idGrado = ?";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, borrar.getCodigoGrado());            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Grado eliminado correctamente");
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


