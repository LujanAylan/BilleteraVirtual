package ar.com.ada.billeteravirtual.excepciones;

import ar.com.ada.billeteravirtual.Persona;

/**
 * PersonaEdadException
 */
public class PersonaEdadException extends Exception {

    private Persona persona;

    public PersonaEdadException(Persona p, String mensaje) {
        super(p.getNombre()+":"+ mensaje);
        this.persona = p;
    }
    
}