/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Colegio;

/**
 *
 * @author Diana
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Persona {
    //Declaracion de atributos del clase persona.
    public String nombres;
    public String apellidos;
    public String telefono;
    public String direccion;
    public String correoElectronico;
    public int codigoPersona;
    public Date fechaRegistro;
    
    // constructor por defecto.
    public Persona() {
    }
 
    //Constructor con parametros.

    public Persona(String nombres, String apellidos, String telefono, String direccion, String correoElectronico, int codigoPersona, Date fechaRegistro) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.codigoPersona = codigoPersona;
        this.fechaRegistro = fechaRegistro;
    }


   

    //Metodos get y set.
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

    public int getCodigoPersona() {
        return codigoPersona;
    }

    public void setCodigoPersona(int codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

   
    
    
}
