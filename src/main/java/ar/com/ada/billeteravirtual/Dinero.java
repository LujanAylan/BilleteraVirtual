package ar.com.ada.billeteravirtual;

/**
 * Dinero
 */
public class Dinero {

    protected int dineroId;
    protected String moneda;
    protected int cantidad;

    public Dinero(){
    }

    public int getDineroId() {
        return dineroId;
    }

    public void setDineroId(int dineroId) {
        this.dineroId = dineroId;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}