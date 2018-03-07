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
    private final String _code;
    private Cuenta[] _cuentas;
    private Tipo[] _tipos;

    public Banco(String _code) {
        this._code = _code;
        this._cuentas = new Cuenta[100];
    }

    public String listarInfo (){
        String mensaje = "\nCuentas: ";
        for(Cuenta cuenta:_cuentas){
            if (cuenta!=null){
            mensaje += "\nNumero de cuenta: " + cuenta.getNumCuenta() +
                    "\nSaldo: " + cuenta.getSaldo() +
                    "\nFecha de creación: " + cuenta.getFechaCreacion().toString() +
                    "\nNombre del Cliente: " + cuenta.getNomCliente();
            Movimientos[] movs=cuenta.getMovimientos();
            mensaje += "\nMovimientos: ";
            for (int i=0;movs.length>i;i++){
                if (movs[i]!=null){
                mensaje +="\nFecha: " + movs[i].getFecha().toString()+
                        "\nSaldo Precedente: " + movs[i].getSaldoPrecedente()+
                        "\nMonto: " + movs[i].getMonto() + 
                        "\nTipo: " + movs[i].getTipo().getCode();
                }
            }
            }
        }
        return mensaje;
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
    
    public boolean addCuenta(Cuenta cuenta) {
        for(int i=0;i<_cuentas.length;i++){
            if(_cuentas[i]==null){
                this._cuentas[i] = cuenta;
                return true;
            }
        }
        return false;
    }

    public boolean removeCuenta(Cuenta cuenta) {
        for(int i=0;i<_cuentas.length;i++){
            if(_cuentas[i]==cuenta){
                this._cuentas[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public Tipo[] getTipos() {
        return _tipos;
    }

    public void setTipos(Tipo[] _tipos) {
        this._tipos = _tipos;
    }
    
    
    
}
