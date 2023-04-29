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
public class Periodo {

    public Integer getCodigoPeriodo() {
        return codigoPeriodo;
    }

    public void setCodigoPeriodo(Integer codigoPeriodo) {
        this.codigoPeriodo = codigoPeriodo;
    }

    public Integer getNumeroPeriodo() {
        return numeroPeriodo;
    }

    public void setNumeroPeriodo(Integer numeroPeriodo) {
        this.numeroPeriodo = numeroPeriodo;
    }

    public String getEstadoAprobacion() {
        return estadoAprobacion;
    }

    public void setEstadoAprobacion(String estadoAprobacion) {
        this.estadoAprobacion = estadoAprobacion;
    }

    public String getNotaAcumulada() {
        return notaAcumulada;
    }

    public void setNotaAcumulada(String notaAcumulada) {
        this.notaAcumulada = notaAcumulada;
    }
    private Integer codigoPeriodo;
    private Integer numeroPeriodo;
    private String estadoAprobacion;
    private String notaAcumulada;
    
}
