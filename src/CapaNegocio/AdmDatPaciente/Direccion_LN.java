
package CapaNegocio.AdmDatPaciente;

import CapaEntidades.AdmDatPaciente.Direccion;
import CapaPersistencia.AdmDatPaciente.Direccion_AD;

/**
 *
 * @author Joshua
 */
public class Direccion_LN {
    
    public Direccion buscarDireccion(String codDireccion) {
        try {
            return new Direccion_AD().buscarDireccion(codDireccion);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
