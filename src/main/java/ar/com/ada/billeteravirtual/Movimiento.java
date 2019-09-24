package ar.com.ada.billeteravirtual;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Movimiento
 */
@Entity
@Table(name = "movimiento")
public class Movimiento {

    @Id
    @Column(name = "movimiento_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer movimientoId;
    @Column(name = "fecha_hora")
    protected Date fecha;
    protected Coordenada ubicacion;
    protected double importe;
    @Column(name = "tipo_operacion")
    protected String tipoOperacion; // -> entrada | salida
    @Column(name = "concepto_operacion")
    protected String conceptoOperacion; // -> depositos / cobros | pagos / transferencias
    protected String detalle; //retiro por cajero, es un mensaje
    protected Integer estado; //estado de movimiento -> aprobado / pendiente / rechazado
    @Column(name = "de_usuario")
    protected String deUsuario;
    @Column(name = "a_usuario")
    protected String aUsuario;
    @Column(name = "cuenta_destino")
    protected String cuentaDestino;
    @Column(name = "cuenta_origen")
    protected String cuentaOrigen;

    @ManyToOne
    @JoinColumn(name = "cuenta_id")
    private Cuenta cuenta;
    
}