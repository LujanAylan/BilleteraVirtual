package ar.com.ada.billeteravirtual;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Cuenta
 */
@Entity
@Table(name = "cuenta")
public class Cuenta {
    
    @Id
    @Column(name = "cuenta_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int cuentaId;
    protected String moneda;
    protected double saldo;
    @Column(name = "saldo_disponible")
    protected double saldoDisponible;
    
    @ManyToOne
    @JoinColumn(name = "billetera_id", referencedColumnName = "billetera_id")
    private Billetera billetera;

    @OneToMany(mappedBy = "cuenta", cascade = CascadeType.ALL)
    private List<Movimiento> movimientos = new ArrayList<Movimiento>();

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public Billetera getBilletera() {
        return billetera;
    }

    public void setBilletera(Billetera billetera) {
        this.billetera = billetera;
    }

    public int getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(int cuentaId) {
        this.cuentaId = cuentaId;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public void agregarMovimientos(Movimiento movimiento){
		movimiento.setCuenta(this);
		this.movimientos.add(movimiento);
		this.setSaldo(this.getSaldo() + movimiento.getImporte());
	}
    
}