
package CapaNegocio.AteTriaje;

import CapaEntidades.AteTriaje.Medico;
import CapaPersistencia.AteTriaje.Medico_AD;
import java.util.ArrayList;

/**
 *
 * @author Joshua
 */
public class Medico_LN {
    
     public ArrayList<Medico> listarMedicoEsp(String codEspecialidad) {
         try {
             return new Medico_AD().listarMedicoEsp(codEspecialidad);
             
         } catch (Exception e) {
             System.out.println("asd" + e);
             System.out.println(e.getMessage());
         }
        return null;
    }
    
}
