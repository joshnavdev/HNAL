
package CapaNegocio.AteTriaje;

import CapaEntidades.AteTriaje.Consulta;
import CapaPersistencia.AteTriaje.Consulta_AD;
import java.util.ArrayList;

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
    
    public ArrayList<Consulta> listarConsultasHc(String codhisClinico) {
        try {
            return new Consulta_AD().listarConsultasHc(codhisClinico);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public int modificarConsultaHC(String codConsulta, String codHisClinico) {
        try {
            return new Consulta_AD().modificarConsultaHC(codConsulta, codHisClinico);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return 0;
    }
    
    public ArrayList<String> obteerEspMedico(String codConsulta) {
        try {
            return new Consulta_AD().obteerEspMedico(codConsulta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return null;
    }
}
