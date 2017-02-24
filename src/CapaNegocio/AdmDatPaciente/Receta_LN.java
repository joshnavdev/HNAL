
package CapaNegocio.AdmDatPaciente;

import CapaEntidades.AdmDatPaciente.Receta;
import CapaPersistencia.AdmDatPaciente.Receta_AD;

/**
 *
 * @author Joshua
 */
public class Receta_LN {
    public Receta buscarReceta(String codReceta) {
        try {
            return new Receta_AD().buscarReceta(codReceta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
