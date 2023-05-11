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
public class funciones_materia extends Conexion {
    
    //Función para agregar una materia con datos validos a la base de datos con los datos ingresados en los txtFields
    public boolean agregarMateria(Materia agregar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        String sql = "INSERT INTO materia(nombreMateria) VALUES (?);";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, agregar.getNombreMateria());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Materia agregada correctamente");
            return true;
            
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede repetir el codigo de una materia", "Advertencia",JOptionPane.WARNING_MESSAGE);
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
    
    //Función para actualizar una materia con datos validos a la base de datos con los datos ingresados en los txtFields
    public boolean actualizarMateria(Materia actualizar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        String sql = "UPDATE materia SET nombreMateria = ? WHERE idMateria = ?;";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, actualizar.getNombreMateria());
            ps.setInt(2, actualizar.getCodigoMateria());            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Materia actualizada correctamente");
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

    //Función para eliminar una materia    
     public boolean eliminarMateria(Materia borrar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        String sql = "DELETE FROM materia WHERE idMateria = ?;";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, borrar.getCodigoMateria());            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Materia eliminada correctamente");
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
