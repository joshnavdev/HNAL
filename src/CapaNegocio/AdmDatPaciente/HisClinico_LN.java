
package CapaNegocio.AdmDatPaciente;

import CapaEntidades.AdmDatPaciente.HisClinico;
import CapaPersistencia.AdmDatPaciente.HisClinico_AD;

/**
 *
 * @author Joshua
 */
public class HisClinico_LN {
    public String generarCodigo() {
        try {
            return new HisClinico_AD().generarCodigo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public int guardarHisClinico(HisClinico hisClinico) {
        try {
            return new HisClinico_AD().guardarHisClinico(hisClinico);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
    public HisClinico buscarHisClinicoPac(String codPaciente) {
        try {
            return new HisClinico_AD().buscarHisClinicoPac(codPaciente);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
