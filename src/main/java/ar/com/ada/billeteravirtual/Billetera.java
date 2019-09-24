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
 * Billetera
 */
@Entity
@Table(name = "billetera")
public class Billetera {

    @Id
    @Column(name = "billetera_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer billeteraId;

    @OneToMany(mappedBy = "cuenta", cascade = CascadeType.ALL)
    private Cuenta cuenta;

    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    private Persona persona;
}