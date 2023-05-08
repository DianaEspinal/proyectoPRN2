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
public class Docente {
    //Declaracion de variables
    private int idDocente;
    private int idMateria;
    
    //Creacion de los constructores

    public Docente() {
    }

    public Docente(int idDocente, int idMateria) {
        this.idDocente = idDocente;
        this.idMateria = idMateria;
    }
    
    //Creacion de getters and setters

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }
    
    
}
