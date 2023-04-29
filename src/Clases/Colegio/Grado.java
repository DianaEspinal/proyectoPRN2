/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Colegio;

/**
 *
 * @author Admin
 */
public class Grado {

    public int getCodigoGrado() {
        return codigoGrado;
    }

    public void setCodigoGrado(int codigoGrado) {
        this.codigoGrado = codigoGrado;
    }

    public int getAnioEnCurso() {
        return anioEnCurso;
    }

    public void setAnioEnCurso(int anioEnCurso) {
        this.anioEnCurso = anioEnCurso;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(String codigoDocente) {
        this.codigoDocente = codigoDocente;
    }
    private int codigoGrado;
    private int anioEnCurso;
    private int codigoEstudiante;
    private String codigoDocente;
}
