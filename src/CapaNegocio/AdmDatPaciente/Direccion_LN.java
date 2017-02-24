
package CapaNegocio.AdmDatPaciente;

import CapaEntidades.AdmDatPaciente.Direccion;
import CapaPersistencia.AdmDatPaciente.Direccion_AD;
import java.util.ArrayList;

/**
 *
 * @author Joshua
 */
public class Direccion_LN {
    public ArrayList<String> listarDepartamento() {
       
        try {
            return new Direccion_AD().listarDepartamento();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public ArrayList<String> listarProvinciaDep(String codDepartamento) {
       
        try {
            return new Direccion_AD().listarProvinciaDep(codDepartamento);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public ArrayList<String> listaDistritoPro(String codProvincia) {
        try {
            return new Direccion_AD().listaDistritoPro(codProvincia);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public Direccion buscarDireccion(String codDireccion) {
        try {
            return new Direccion_AD().buscarDireccion(codDireccion);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
