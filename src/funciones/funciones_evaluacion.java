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
public class funciones_evaluacion extends Conexion {
    
    //Función que ayuda a llenar el modelo del comboBox para que este tenga información de la base
    public DefaultComboBoxModel llenarDocentes()
    {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try 
        {
            PreparedStatement ps = conectar().prepareStatement("SELECT idPersona, CONCAT(nombres,' ',apellidos) AS nombrecompleto FROM persona\n" +
                                                                "WHERE persona.idPersona IN (SELECT idDocente FROM docente);");
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
    
    //Función para agregar una nueva evaluación con datos validos a la base de datos con los datos ingresados en los txtFields
    public boolean agregarEvaluacion(Evaluacion agregar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        String sql = "INSERT INTO evaluacion(idDocente, numeroEvaluacion, descripcion, porcentajeEvaluacion) VALUES (? , ?, ?, ?);";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, agregar.getCodigoDocente());
            ps.setInt(2, agregar.getNumeroEvaluacion());
            ps.setString(3, agregar.getDescripcion());
            ps.setDouble(4, agregar.getPorcentajeEvaluacion());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Evaluacion agregado correctamente");
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
    
    //Función para actualizar una evaluación con datos validos a la base de datos con los datos ingresados en los txtFields
    public boolean actualizarEvaluacion(Evaluacion actualizar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        String sql = "UPDATE evaluacion SET idDocente = ?, descripcion = ?, numeroEvaluacion = ? WHERE idEvaluacion = ?;";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, actualizar.getCodigoDocente());
            ps.setString(2, actualizar.getDescripcion()); 
            ps.setInt(3, actualizar.getNumeroEvaluacion());
            ps.setInt(4, actualizar.getCodigoEvaluacion());

            ps.execute();
            JOptionPane.showMessageDialog(null, "Evaluación actualizada correctamente");
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
    
    //Función para eliminar una evaluación    
    public boolean eliminarEvaluacion(Evaluacion borrar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        String sql = "DELETE FROM evaluacion WHERE idEvaluacion = ?";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, borrar.getCodigoEvaluacion());            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Evaluación eliminada correctamente");
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
