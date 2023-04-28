/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prn215_grupo_4_1;

/**
 *
 * @author Admin
 */
public class Grado {

    public Integer getCodigoGrado() {
        return codigoGrado;
    }

    public void setCodigoGrado(Integer codigoGrado) {
        this.codigoGrado = codigoGrado;
    }

    public Integer getAnioEnCurso() {
        return anioEnCurso;
    }

    public void setAnioEnCurso(Integer anioEnCurso) {
        this.anioEnCurso = anioEnCurso;
    }

    public Integer getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(Integer codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(String codigoDocente) {
        this.codigoDocente = codigoDocente;
    }
    private Integer codigoGrado;
    private Integer anioEnCurso;
    private Integer codigoEstudiante;
    private String codigoDocente;
}
