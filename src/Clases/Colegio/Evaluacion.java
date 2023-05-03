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
public class Evaluacion {
    //Creacion de variables
    int codigoEvaluacion;
    int codigoDocente;
    int codigoPeriodo;
    int numeroEvaluacion;
    String descripcion;
    double porcentajeEvaluacion;
    double notaEvaluacion;
    private String materia;
    
    //Constructor por defecto

    public Evaluacion() {
    }
    
    //Constructor con parametros

    public Evaluacion(int codigoEvaluacion, int codigoDocente, int codigoPeriodo, int numeroEvaluacion, String descripcion, double porcentajeEvaluacion, double notaEvaluacion, String materia) {
        this.codigoEvaluacion = codigoEvaluacion;
        this.codigoDocente = codigoDocente;
        this.codigoPeriodo = codigoPeriodo;
        this.numeroEvaluacion = numeroEvaluacion;
        this.descripcion = descripcion;
        this.porcentajeEvaluacion = porcentajeEvaluacion;
        this.notaEvaluacion = notaEvaluacion;
        this.materia=materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    //Creacion de getters and setters

    public int getCodigoEvaluacion() {
        return codigoEvaluacion;
    }

    public void setCodigoEvaluacion(int codigoEvaluacion) {
        this.codigoEvaluacion = codigoEvaluacion;
    }

    public int getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(int codigoDocente) {
        this.codigoDocente = codigoDocente;
    }

    public int getCodigoPeriodo() {
        return codigoPeriodo;
    }

    public void setCodigoPeriodo(int codigoPeriodo) {
        this.codigoPeriodo = codigoPeriodo;
    }

    public int getNumeroEvaluacion() {
        return numeroEvaluacion;
    }

    public void setNumeroEvaluacion(int numeroEvaluacion) {
        this.numeroEvaluacion = numeroEvaluacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPorcentajeEvaluacion() {
        return porcentajeEvaluacion;
    }

    public void setPorcentajeEvaluacion(double porcentajeEvaluacion) {
        this.porcentajeEvaluacion = porcentajeEvaluacion;
    }

    public double getNotaEvaluacion() {
        return notaEvaluacion;
    }

    public void setNotaEvaluacion(double notaEvaluacion) {
        this.notaEvaluacion = notaEvaluacion;
    }
    
    
    
}
