
package CapaNegocio.AteTriaje;

import CapaEntidades.AteTriaje.Consulta;
import CapaPersistencia.AteTriaje.Consulta_AD;

/**
 *
 * @author Joshua
 */
public class Consulta_LN {
    
    public String generarCodigo() {
        try {
            return new Consulta_AD().generarCodigo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public int crearConsulta(Consulta consulta) {
        try {
            return new Consulta_AD().crearConsulta(consulta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
}
