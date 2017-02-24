
package CapaNegocio.AdmDatPaciente;

import CapaEntidades.AdmDatPaciente.TarPaciente;
import CapaPersistencia.AdmDatPaciente.TarPaciente_AD;

/**
 *
 * @author Joshua
 */
public class TarPaciente_LN {
    public TarPaciente genTarPaciente(String codConsulta) {
        try {
            return new TarPaciente_AD().genTarPaciente(codConsulta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return null;
    }
}
