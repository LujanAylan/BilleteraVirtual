package ar.com.ada.billeteravirtual;

import java.sql.Date;

/**
 * Movimiento
 */
public class Movimiento {

    protected int movimientoId;
    protected Date fecha;
    protected Coordenada ubicacion;
    protected double importe;
    protected String tipoOperacion; // -> entrada | salida 
    protected String conceptoOperacion; // -> depositos / cobros | pagos / transferencias 
    protected String detalle; //retiro por cajero, es un mensaje
    protected Integer estado; //estado de movimiento -> aprobado / pendiente / rechazado
    protected String deUsuario;
    protected String aUsuario;
    protected String cuentaDestino;
    protected String cuentaOrigen;
}