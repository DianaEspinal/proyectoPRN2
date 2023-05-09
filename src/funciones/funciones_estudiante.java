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
public class funciones_estudiante extends Conexion {
      
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
    
    /*public Persona obtenerDatosPersona(int id)
    {
        Persona p = new Persona();
        try {
            String sql = "SELECT * FROM persona WHERE idPersona = ?";
            PreparedStatement ps = conectar().prepareCall(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                p.setCodigoPersona(rs.getInt("idPersona"));
                p.setNombres(rs.getString("nombres"));
                p.setApellidos(rs.getString("apellidos"));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Socorro");
            }
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return p;
    }*/
    
    public boolean agregarEstudiante(Estudiante agregar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        //String sqlVerify = "SELECT * FROM WHERE id = ?";
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
    
    public boolean eliminarEstudiante(Estudiante borrar)
    {
        PreparedStatement ps = null;
        
        Connection con = conectar();
        String sql = "DELETE FROM Estudiante WHERE idEstudiante = ?";
        
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
