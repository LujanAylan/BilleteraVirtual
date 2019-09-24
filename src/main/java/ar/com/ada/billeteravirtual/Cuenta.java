package ar.com.ada.billeteravirtual;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Cuenta
 */
@Entity
@Table(name = "cuenta")
public class Cuenta {
    
    @Id
    @Column(name = "cuenta_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer cuentaId;
    protected String moneda;
    protected double saldo;
    @Column(name = "saldo_disponible")
    protected double saldoDisponible;

    @OneToMany(mappedBy = "movimiento", cascade = CascadeType.ALL)
    private Movimiento movimiento;

}