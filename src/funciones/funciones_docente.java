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
import com.mysql.cj.jdbc.JdbcPreparedStatement;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;


/**
 *
 * @author diego
 */
public class funciones_docente extends Conexion{
    
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
    
    public boolean agregarDocente(Docente agregar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        //String sqlVerify = "SELECT * FROM WHERE id = ?";
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
