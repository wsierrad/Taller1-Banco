/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.taller.banco.vista;
import edu.taller.banco.modelo.*;
import java.util.Date;

/**
 *
 * @author willi_000
 */
public class Principal {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        Banco b1 =new Banco("46573892");
        Date d1=new Date();
        Cuenta c1=new Cuenta(12323,500000.0,d1,"Juan");
        Cuenta c2=new Cuenta(14523,650000.0,d1,"Simón");
        boolean addc1 = b1.addCuenta(c1);
        boolean addc2 = b1.addCuenta(c2);
        Tipo t1 = new Tipo("Retiro");
        Tipo t2 = new Tipo("Consignacion");
        Tipo[] ts= {t1,t2};
        b1.setTipos(ts);
        Cuenta[] cuentas = b1.getCuentas();
        for (Cuenta cuenta : cuentas) {
            if (cuenta != null) {
                cuenta.addMovs(d1, 250000.0, t1);
                cuenta.addMovs(d1, 300000.0, t2);
            }
        }
        System.out.println(b1.listarInfo());
        
    }
}
