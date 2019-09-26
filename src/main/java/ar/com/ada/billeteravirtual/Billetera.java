package ar.com.ada.billeteravirtual;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

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

}