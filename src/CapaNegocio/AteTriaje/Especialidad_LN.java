
package CapaNegocio.AteTriaje;

import CapaEntidades.AteTriaje.Especialidad;
import CapaPersistencia.AteTriaje.Especialidad_AD;
import java.util.ArrayList;

/**
 *
 * @author Joshua
 */
public class Especialidad_LN {
    
    public ArrayList<Especialidad> listarEspecialidad() {
        try {
            return new Especialidad_AD().listarEspecialidad();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
}
