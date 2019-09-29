package ar.com.ada.billeteravirtual;

import java.util.Date;

import javax.persistence.*;

/**
 * Movimiento
 */
@Entity
@Table(name = "movimiento")
public class Movimiento {

    @Id
    
    @Column(name = "movimiento_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int movimientoId;
    @Column(name = "fecha_hora")
    protected Date fecha;
    //protected Coordenada ubicacion;
    protected double importe;
    @Column(name = "tipo_operacion")
    protected String tipoOperacion; // -> entrada | salida
    @Column(name = "concepto_operacion")
    protected String conceptoOperacion; // -> depositos / cobros | pagos / transferencias
    protected String detalle; //retiro por cajero, es un mensaje
    protected int estado; //estado de movimiento -> aprobado / pendiente / rechazado
    @Column(name = "de_usuario")
    protected int deUsuario;
    @Column(name = "a_usuario")
    protected int aUsuario;
    @Column(name = "cuenta_destino")
    protected int cuentaDestino;
    @Column(name = "cuenta_origen")
    protected int cuentaOrigen;

    @ManyToOne
    @JoinColumn(name = "cuenta_id", referencedColumnName = "cuenta_id")
    private Cuenta cuenta;

    public Movimiento(){
    }

    public int getMovimientoId() {
        return movimientoId;
    }

    public void setMovimientoId(int movimientoId) {
        this.movimientoId = movimientoId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date date) {
        this.fecha = date;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public String getConceptoOperacion() {
        return conceptoOperacion;
    }

    public void setConceptoOperacion(String conceptoOperacion) {
        this.conceptoOperacion = conceptoOperacion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getDeUsuario() {
        return deUsuario;
    }

    public void setDeUsuario(int deUsuario) {
        this.deUsuario = deUsuario;
    }

    public int getaUsuario() {
        return aUsuario;
    }

    public void setaUsuario(int aUsuario) {
        this.aUsuario = aUsuario;
    }

    public int getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(int cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public int getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(int cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

}