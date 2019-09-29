package ar.com.ada.billeteravirtual;

import java.util.*;

import javax.persistence.*;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 * Billetera
 */
@Entity
@Table(name = "billetera")
public class Billetera {

    @Id
    @Column(name = "billetera_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int billeteraId;

    public Billetera(){
    }

    public Billetera(int billeteraId){
        this.billeteraId = billeteraId;
    }

    @OneToMany(mappedBy = "billetera", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Cuenta> cuentas = new ArrayList<Cuenta>();

    @OneToOne
    @JoinColumn(name = "persona_id", referencedColumnName = "persona_id")
    private Persona persona;

    
    public int getBilleteraId() {
        return billeteraId;
    }

    public void setBilleteraId(int billeteraId) {
        this.billeteraId = billeteraId;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public Persona getPersona() {
        return persona;
    }

	public void setPersona(Persona persona) {
    }
    
    public void agregarCuentas (Cuenta cuenta) {
        cuenta.setBilletera(this);
        this.cuentas.add(cuenta); 
    }

    /*public void agregarMovInicial(double importe){
        Movimiento m = new Movimiento();
        m.setTipoOperacion("Entrada");
        m.setConceptoOperacion("Transferencia");
        m.setDetalle("Saldo inicial");
        m.setEstado(0);
        m.setImporte(200);
        m.setFecha(new Date());
        m.setDeUsuario(this.persona.getUsuario().getUsuarioId());
        m.setaUsuario(this.persona.getUsuario().getUsuarioId());
        m.setCuentaOrigen(this.cuentas.get(0).getCuentaId());
        m.setCuentaDestino(this.cuentas.get(0).getCuentaId());
    }*/

}