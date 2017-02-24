
package CapaNegocio.AdmDatPaciente;

import CapaEntidades.AdmDatPaciente.Geografico;
import CapaPersistencia.AdmDatPaciente.Geografico_AD;
import java.util.ArrayList;

/**
 *
 * @author Joshua
 */
public class Geografico_LN {
    
    public ArrayList<Geografico> listarDepartamento() {
       
        try {
            return new Geografico_AD().listarDepartamento();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public ArrayList<Geografico> listarProvinciaDep(String codDepartamento) {
       
        try {
            return new Geografico_AD().listarProvinciaDep(codDepartamento);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public ArrayList<Geografico> listaDistritoPro(String codProvincia) {
        try {
            return new Geografico_AD().listaDistritoPro(codProvincia);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
