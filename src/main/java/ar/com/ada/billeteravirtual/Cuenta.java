package ar.com.ada.billeteravirtual;

import java.util.ArrayList;
import java.util.List;

/**
 * Cuenta
 */
public class Cuenta {

    protected String moneda;
    protected double saldo;
    protected double saldoDisponible;
    //protected int nroCuenta; //tiene que ser unívoco en todo el programa

    public static List<Movimiento> movimientos = new ArrayList<Movimiento>();
   
}