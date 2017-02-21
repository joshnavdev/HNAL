
package CapaNegocio;

import CapaPersistencia.Date_AD;

/**
 *
 * @author Joshua
 */
public class Date_LN {
    
    public String obtenerFecha() {
        try {
            return new Date_AD().obtenerFecha();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public String obtenerFechaHora() {
        try {
            return new Date_AD().obtenerFechaHora();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
}
