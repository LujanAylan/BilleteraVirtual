package ar.com.ada.billeteravirtual;

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
    protected Integer cuentaId;
    protected String moneda;
    protected double saldo;
    @Column(name = "saldo_disponible")
    protected double saldoDisponible;

    @OneToMany
    @JoinColumn(name = "billetera_id", referencedColumnName = "billetera_id")
    private Billetera billetera;

    @OneToMany(mappedBy = "cuenta", cascade = CascadeType.ALL)
    private Movimiento movimiento;

}