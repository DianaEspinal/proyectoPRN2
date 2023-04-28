/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Colegio;

/**
 *
 * @author Manuel
 */
public class Materia {
    
    //Creacion de variables
    String codigoMateria;
    String nombreMateria;
    
    //Cosntructor sin parametros

    public Materia() {
    }
    
    //Constructor con parametros

    public Materia(String codigoMateria, String nombreMateria) {
        this.codigoMateria = codigoMateria;
        this.nombreMateria = nombreMateria;
    }
    
    //Creacion de getters and setters

    public String getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
    
    
}
