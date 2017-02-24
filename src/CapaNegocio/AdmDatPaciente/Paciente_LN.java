
package CapaNegocio.AdmDatPaciente;

import CapaEntidades.AdmDatPaciente.Paciente;
import CapaPersistencia.AdmDatPaciente.Paciente_AD;

/**
 *
 * @author Joshua
 */
public class Paciente_LN {
    public int guardarPaciente(Paciente paciente) {
        try {
            return new Paciente_AD().guardarPaciente(paciente);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
    public Paciente buscarPacienteDNI(String dni) {
        try {
            return new Paciente_AD().buscarPacienteDNI(dni);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
