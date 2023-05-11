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
public class funciones_estudiante extends Conexion {
      
    //Función que ayuda a llenar el modelo del comboBox para que este tenga información de la base
    public DefaultComboBoxModel llenarPersonas()
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try 
        {
            PreparedStatement ps = conectar().prepareStatement("SELECT idPersona, CONCAT(nombres,' ',apellidos) AS nombrecompleto FROM persona\n" +
                                                                "WHERE persona.idPersona NOT IN (SELECT idEstudiante FROM estudiante) AND\n" +
                                                                "persona.idPersona NOT IN (SELECT idDocente FROM docente);");
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
    
    //Función que ayuda a llenar el modelo del comboBox para que este tenga información de la base
    public DefaultComboBoxModel llenarGrado()
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try 
        {
            PreparedStatement ps = conectar().prepareStatement("SELECT idGrado, grado FROM Grado");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {                
                modelo.addElement(rs.getString("grado"));
            }
        } catch (Exception e) 
        {
            System.out.println(e.toString());
        }
        
        return modelo;
    }
    
    //Función para agregar un estudiante con datos validos a la base de datos con los datos ingresados en los txtFields
    public boolean agregarEstudiante(Estudiante agregar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        //Se verifica que el idEstudiante no exista en la tabla docente(idDocente) ya que como es por herencia, son idDocente e idEstudiante son foraneas de idPersona
        String sql = "INSERT INTO  estudiante(idEstudiante, idGrado, estadoAprobacion, nombreEncargado)\n" +
                    "SELECT * FROM (SELECT ? AS idEstudiante, ? AS idGrado, 'En proceso' AS estadoAprobacion, ? AS nombreEncargado) AS tmp\n" +
                    "WHERE NOT EXISTS (\n" +
                    "SELECT idDocente FROM docente WHERE idDocente = ?\n" +
                    ");";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, agregar.getCodigoEstudiante());
            ps.setString(2, agregar.getIdGrado());
            ps.setString(3, agregar.getNombreEncargado());
            ps.setInt(4, agregar.getCodigoEstudiante());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Estudiante agregado correctamente");
            return true;
            
        } catch (SQLException e) 
        {
            //En dado caso suceda que el idEstudiante se encuentre en la tabla estudiantes pero es imposible
            JOptionPane.showMessageDialog(null, "No puede repetir el codigo de un Estudiante", "Advertencia",JOptionPane.WARNING_MESSAGE);
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
    
    //Función para actualizar un estudiante con datos validos a la base de datos con los datos ingresados en los txtFields
    public boolean actualizarEstudiante(Estudiante actualizar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        String sql = "UPDATE estudiante SET idGrado = ?, nombreEncargado = ? WHERE idEstudiante = ?;";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, actualizar.getIdGrado());
            //ps.setString(2, actualizar.getEstadoAprobacion());
            ps.setString(2, actualizar.getNombreEncargado());    
            ps.setInt(3, actualizar.getCodigoEstudiante());
            System.out.println(actualizar.getIdGrado());
            System.out.println(actualizar.getNombreEncargado());
            System.out.println(actualizar.getCodigoEstudiante());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Estudiante actualizado correctamente");
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
    //Función para eliminar un estudiante    
    public boolean eliminarEstudiante(Estudiante borrar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        String sql = "DELETE FROM estudiante WHERE idEstudiante = ?";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, borrar.getCodigoEstudiante());            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Estudiante eliminado correctamente");
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
    
    //Función que ayuda a encontrar el idGrado del nombre seleccionado del comboBox 
    public String getIdGrado (String grado)
    {        
        String id = null;
        try{
            
            String sql = "SELECT idGrado FROM grado  WHERE grado = ?;";
            PreparedStatement cmd = conectar().prepareStatement(sql);
            cmd.setString(1, grado);
            
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
               id = rs.getString(1);
            }
            
            
        } catch(Exception e){
            System.out.println(e.toString());
        }
        return id;
    }
    
}
