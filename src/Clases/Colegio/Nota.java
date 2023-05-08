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


public class Nota  {
    private int codigoNota;
    private int codigoEstudiante;
    private int codigoEvaluacion;
    private int codigoPeriodo;
    private double nota;

    public Nota() {
    }

    public Nota(int codigoNota, int codigoEstudiante, int codigoEvaluacion, int codigoPeriodo, double nota) {
        this.codigoNota = codigoNota;
        this.codigoEstudiante = codigoEstudiante;
        this.codigoEvaluacion = codigoEvaluacion;
        this.codigoPeriodo = codigoPeriodo;
        this.nota = nota;
    }

    public int getCodigoNota() {
        return codigoNota;
    }

    public void setCodigoNota(int codigoNota) {
        this.codigoNota = codigoNota;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public int getCodigoEvaluacion() {
        return codigoEvaluacion;
    }

    public void setCodigoEvaluacion(int codigoEvaluacion) {
        this.codigoEvaluacion = codigoEvaluacion;
    }

    public int getCodigoPeriodo() {
        return codigoPeriodo;
    }

    public void setCodigoPeriodo(int codigoPeriodo) {
        this.codigoPeriodo = codigoPeriodo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
}
