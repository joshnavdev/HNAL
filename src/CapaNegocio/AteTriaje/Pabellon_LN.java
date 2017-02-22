
package CapaNegocio.AteTriaje;

import CapaPersistencia.AteTriaje.Pabellon_AD;

/**
 *
 * @author Joshua
 */
public class Pabellon_LN {
    
    public String buscarNomPabellon(String codPabellon) {
        try {
            return new Pabellon_AD().buscarNomPabellon(codPabellon);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
}
