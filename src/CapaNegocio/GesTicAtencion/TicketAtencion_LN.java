
package CapaNegocio.GesTicAtencion;

import CapaEntidades.GesTicAtencion.TicketAtencion;
import CapaPersistencia.GesTicAtencion.TicketAtencion_AD;

/**
 *
 * @author Joshua
 */
public class TicketAtencion_LN {
    
    public String generarCodigo() {
        try {
            return new TicketAtencion_AD().generarCodigo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public int guardarTicketAtencion(TicketAtencion ticket) {
        try {
            return new TicketAtencion_AD().guardarTickeAtencion(ticket);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
}
