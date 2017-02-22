
package CapaNegocio.AteTriaje;

import CapaEntidades.AteTriaje.TicketDerivacion;
import CapaPersistencia.AteTriaje.TicketDerivacion_AD;

/**
 *
 * @author Joshua
 */
public class TicketDerivacion_LN {
    
    public String generarCodigo() {
        try {
            return new TicketDerivacion_AD().generarCodigo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public int guardarTicDerivacion(TicketDerivacion ticket) {
        try {
            return new TicketDerivacion_AD().guardarTicDerivacion(ticket);
        } catch (Exception e) {
        }
        return 0;
    }
    
}
