/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.taller.banco.modelo;

/**
 *
 * @author willi_000
 */
public class Banco {
    private String _code;
    private Cuenta[] _cuentas;
    private Tipo[] _tipos;

    public Banco(String _code) {
        this._code = _code;
    }

    public String getCode() {
        return _code;
    }

    public Cuenta[] getCuentas() {
        return _cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this._cuentas = cuentas;
    }

    public Tipo[] getTipos() {
        return _tipos;
    }

    public void setTipos(Tipo[] _tipos) {
        this._tipos = _tipos;
    }
    
    
    
}
