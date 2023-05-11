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
public class funciones_docente extends Conexion{
    
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
    public DefaultComboBoxModel llenarMateria()
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try 
        {
            PreparedStatement ps = conectar().prepareStatement("SELECT idMateria, nombreMateria FROM materia");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {                
                modelo.addElement(rs.getString("nombreMateria"));
            }
        } catch (Exception e) 
        {
            System.out.println(e.toString());
        }
        
        return modelo;
    }
    
    //Función para agregar un docente con datos validos a la base de datos con los datos ingresados en los txtFields
    public boolean agregarDocente(Docente agregar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        //Se verifica que el idDocente no exista en la tabla Estudiante(idEstudiante) ya que como es por herencia, son idDocente e idEstudiante son foraneas de idPersona
        String sql = "INSERT INTO  docente(idDocente, idMateria)\n" +
                    "SELECT * FROM (SELECT ? AS idDocente, ? AS idMateria) AS tmp\n" +
                    "WHERE NOT EXISTS (\n" +
                    "SELECT idEstudiante FROM estudiante WHERE idEstudiante = ?\n" +
                    ");";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, agregar.getIdDocente());
            ps.setInt(2, agregar.getIdMateria());
            ps.setInt(3, agregar.getIdDocente());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Docente agregado correctamente");
            return true;
            
        } catch (SQLException e) 
        {
            //En dado caso suceda que el idDocente se encuentre en la tabla estudiantes pero es imposible
            JOptionPane.showMessageDialog(null, "No puede repetir el codigo de un Docente", "Advertencia",JOptionPane.WARNING_MESSAGE);
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
    
    //Función para actualizar un docente con datos validos a la base de datos con los datos ingresados en los txtFields
    public boolean actualizarDocente(Docente actualizar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        String sql = "UPDATE docente SET idMateria = ? WHERE idDocente = ?";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, actualizar.getIdMateria());            
            ps.setInt(2, actualizar.getIdDocente());
            //System.out.println(actualizar.getIdMateria());
            //System.out.println(actualizar.getIdDocente());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Docente actualizado correctamente");
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
    
    //Función para eliminar un docente
    public boolean eliminarDocente(Docente borrar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        String sql = "DELETE FROM docente WHERE idDocente = ?";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, borrar.getIdDocente());            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Docente eliminado correctamente");
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
    
    //Función que ayuda a encontrar el idMateria de nombreMateria seleccionado del comboBox
    public String getIdMateria (String materia)
    {        
        String id = null;
        try{
            
            String sql = "SELECT idMateria FROM materia  WHERE nombreMateria = ?;";
            PreparedStatement cmd = conectar().prepareStatement(sql);
            cmd.setString(1, materia);
            
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
