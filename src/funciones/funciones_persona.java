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
public class funciones_persona extends Conexion {
    
    //Función para agregar una persona con datos validos a la base de datos con los datos ingresados en los txtFields
    public boolean agregarPersona(Persona agregar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        String sql = "INSERT INTO persona(nombres, apellidos, telefono, direccion, correoElectronico, fechaRegistro) VALUES (?, ?, ?, ?, ?, CURRENT_DATE());";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, agregar.getNombres());
            ps.setString(2, agregar.getApellidos());
            ps.setString(3, agregar.getTelefono());
            ps.setString(4, agregar.getDireccion());
            ps.setString(5, agregar.getCorreoElectronico());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Persona agregada correctamente");
            return true;
            
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede repetir el codigo de una persona", "Advertencia",JOptionPane.WARNING_MESSAGE);
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
    
    //Función para actualizar una persona con datos validos a la base de datos con los datos ingresados en los txtFields
    public boolean actualizarPersona(Persona actualizar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        String sql = "UPDATE persona SET nombres = ?, apellidos = ?, telefono = ?, direccion = ?, correoElectronico = ? WHERE idPersona = ?; ";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, actualizar.getNombres());
            ps.setString(2, actualizar.getApellidos());   
            ps.setString(3, actualizar.getTelefono());
            ps.setString(4, actualizar.getDireccion());
            ps.setString(5, actualizar.getCorreoElectronico());
            ps.setInt(6, actualizar.getCodigoPersona());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Datos de persona actualizada correctamente");
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
    
    //Función para eliminar una persona
     public boolean eliminarPersona(Persona borrar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        String sql = "DELETE FROM persona WHERE idPersona = ?;";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, borrar.getCodigoPersona());            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Persona eliminada correctamente");
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
