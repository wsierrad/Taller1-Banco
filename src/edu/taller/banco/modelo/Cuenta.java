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
public class Cuenta {
    private final int _numCuenta;
    private double _saldo;
    private final Date _fechaCreacion;
    private String nomCliente;
    private Movimientos[] movimientos;

    public Cuenta(int _numCuenta, double _saldo, Date _fechaCreacion, String nomCliente) {
        this._numCuenta = _numCuenta;
        this._saldo = _saldo;
        this._fechaCreacion = _fechaCreacion;
        this.nomCliente = nomCliente;
        movimientos= new Movimientos[100];
    }
    
    public boolean addMovs(Date fecha, double monto, Tipo tipo){
        for (int i=0;movimientos.length>i;i++){
            if (movimientos[i]==null){
                Movimientos mov= new Movimientos(fecha,this._saldo,monto,tipo);
                movimientos[i]= mov;
                if(mov.getTipo().getCode().equals("Retiro"))
                    _saldo-=mov.getMonto();
                else if(mov.getTipo().getCode().equals("Consignacion"))
                    _saldo+=mov.getMonto();
                return true;
            }
        }
        return false;
    } 
    
    public Movimientos[] getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(Movimientos[] movimientos) {
        this.movimientos = movimientos;
    }

    public double getSaldo() {
        return _saldo;
    }

    public void setSaldo(double _saldo) {
        this._saldo = _saldo;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public int getNumCuenta() {
        return _numCuenta;
    }

    public Date getFechaCreacion() {
        return _fechaCreacion;
    }
    
}
