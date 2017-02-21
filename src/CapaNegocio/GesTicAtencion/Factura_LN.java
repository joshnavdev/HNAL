
package CapaNegocio.GesTicAtencion;

import CapaEntidades.GesTicAtencion.Factura;
import CapaPersistencia.GesTicAtencion.Factura_AD;

/**
 *
 * @author Joshua
 */
public class Factura_LN {
    
    public int guardarFactyra(Factura factura) {
        try {
            return new Factura_AD().guardarFactura(factura);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
}
