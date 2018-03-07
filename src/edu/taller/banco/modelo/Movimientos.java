/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.taller.banco.modelo;
import java.util.Date;

/**
 *
 * @author willi_000
 */
public class Movimientos {
    private Date _fecha;
    private double _saldoPrecedente;
    private double _monto;
    private Tipo _tipo;

    public Movimientos(Date _fecha, double _saldoPrecedente, double _monto, Tipo _tipo) {
        this._fecha = _fecha;
        this._saldoPrecedente = _saldoPrecedente;
        this._monto = _monto;
        this._tipo = _tipo;
    }
    
    public Date getFecha() {
        return _fecha;
    }

    public double getSaldoPrecedente() {
        return _saldoPrecedente;
    }

    public void setSaldoPrecedente(double _saldoPrecedente) {
        this._saldoPrecedente = _saldoPrecedente;
    }

    public double getMonto() {
        return _monto;
    }

    public void setMonto(double _monto) {
        this._monto = _monto;
    }

    public Tipo getTipo() {
        return _tipo;
    }

    public void setTipo(Tipo _tipo) {
        this._tipo = _tipo;
    } 
    
}
