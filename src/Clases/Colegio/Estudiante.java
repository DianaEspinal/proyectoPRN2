/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Colegio;

import funciones.funciones_estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.time.LocalDate;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diana.
 */
public class Estudiante extends Persona {
     //Declaracion de atributos del clase estudiante.
    private int codigoEstudiante;
    private String estadoAprobacion;
    private String nombreEncargado;
    private String idGrado;
    // Declaracion del constructor por defecto.
    public Estudiante() {
    }
    //Declaracion de constructores con parametros.

    public Estudiante(int codigoEstudiante, String estadoAprobacion, String nombreEncargado, String idGrado) {
        this.codigoEstudiante = codigoEstudiante;
        this.estadoAprobacion = estadoAprobacion;
        this.nombreEncargado = nombreEncargado;
        this.idGrado = idGrado;
    }

    public Estudiante(int codigoEstudiante, String estadoAprobacion, String nombreEncargado, String idGrado, String nombres, String apellidos, String telefono, String direccion, String correoElectronico, int codigoPersona, Date fechaRegistro) {
        super(nombres, apellidos, telefono, direccion, correoElectronico, codigoPersona, fechaRegistro);
        this.codigoEstudiante = codigoEstudiante;
        this.estadoAprobacion = estadoAprobacion;
        this.nombreEncargado = nombreEncargado;
        this.idGrado = idGrado;
    }

  
    
     // Metodos get y set.
    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getEstadoAprobacion() {
        return estadoAprobacion;
    }

    public void setEstadoAprobacion(String estadoAprobacion) {
        this.estadoAprobacion = estadoAprobacion;
    }

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(String idGrado) {
        this.idGrado = idGrado;
    }


    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

   

    
}
