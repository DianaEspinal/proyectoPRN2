/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;
import Clases.Colegio.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author diego
 */
public class funciones_usuario extends Conexion{
    
    //Función que ayuda a llenar el modelo del comboBox para que este tenga información de la base
    public DefaultComboBoxModel llenarPersonas()
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try 
        {
            PreparedStatement ps = conectar().prepareStatement("SELECT idPersona, CONCAT(nombres,' ',apellidos) AS nombrecompleto FROM persona\n" +
                                                                "WHERE persona.idPersona NOT IN (SELECT idUsuario FROM usuario);");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {                
                modelo.addElement(rs.getString("nombrecompleto"));
                
            }
        } catch (Exception e) 
        {
            System.out.println(e.toString());
        }
        
        return modelo;
    }
    
    //Función para agregar un nuevo usuario con datos validos a la base de datos con los datos ingresados en los txtFields
    public boolean agregarUsuario(Usuario agregar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        //Se verifica que el idPersona no existe en Usuario(idUsuario) ya que como es herencia, idUsuario es foranea de idPersona
        String sql = "INSERT INTO  usuario(idUsuario, usuario, clave)\n" +
                    "SELECT * FROM (SELECT ? AS idUsuario, ? AS usuario, ? AS clave) AS tmp\n" +
                    "WHERE NOT EXISTS (\n" +
                    "SELECT idUsuario FROM usuario WHERE idUsuario = ?\n" +
                    ") LIMIT 1;";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, agregar.getIdUsuario());
            ps.setString(2, agregar.getUsuario());
            ps.setString(3, agregar.getClave());
            ps.setInt(4, agregar.getIdUsuario());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Usuario agregado correctamente");
            return true;
            
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede repetir el codigo de un Uusario", "Advertencia",JOptionPane.WARNING_MESSAGE);
            System.out.println(e);
            return false;
        } 
        finally
        {
            try {
                con.close();                
            } catch (Exception e) 
            {
                System.out.println(e.toString());
            }
        }
    }
    
    //Función para actualizar un usuario con datos validos a la base de datos con los datos ingresados en los txtFields
    public boolean actualizarUsuario(Usuario actualizar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        String sql = "UPDATE usuario SET usuario = ?, clave = ? WHERE idUsuario = ?;";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, actualizar.getUsuario());
            //ps.setString(2, actualizar.getEstadoAprobacion());
            ps.setString(2, actualizar.getClave());    
            ps.setInt(3, actualizar.getIdUsuario());

            ps.execute();
            JOptionPane.showMessageDialog(null, "Uusario actualizado correctamente");
            return true;
            
        } catch (SQLException e) 
        {
            System.out.println(e.toString());
            return false;
        } 
        finally
        {
            try {
                con.close();                
            } catch (Exception e) 
            {
                System.out.println(e.toString());
            }
        }
    }
    
    //Función para eliminar un usuario
    public boolean eliminarUsuario(Usuario borrar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        String sql = "DELETE FROM usuario WHERE idUsuario = ?";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, borrar.getIdUsuario());            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
            return true;
            
        } catch (SQLException e) 
        {
            System.out.println(e.toString());
            return false;
        } 
        finally
        {
            try {
                con.close();                
            } catch (Exception e) 
            {
                System.out.println(e.toString());
            }
        }
    }
    
    //Función que ayuda a encontrar el idPersona del nombre seleccionado del comboBox
    public Integer getIdPersona (String nombreCompleto)
    {        
        int id = 0;
        try{
            
            String sql = "SELECT idPersona FROM persona  WHERE CONCAT(nombres,' ',apellidos) LIKE ?;";
            PreparedStatement cmd = conectar().prepareStatement(sql);
            cmd.setString(1, nombreCompleto);
            
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
               id = rs.getInt(1);
            }
            
            
        } catch(Exception e){
            System.out.println(e.toString());
        }
        return id;
    }
    
}
