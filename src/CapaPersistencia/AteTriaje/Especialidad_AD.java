
package CapaPersistencia.AteTriaje;

import CapaEntidades.AteTriaje.Especialidad;
import CapaPersistencia.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Joshua
 */
public class Especialidad_AD {
    //DATOS PARA EL MANEJO DE LA BASE DE DATOS
    private final Connection conexion = new Conexion("HNAL","1234").getConexion();
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public ArrayList<Especialidad> listarEspecialidad() {
        ArrayList<Especialidad> especialidades = new ArrayList<>();
        Especialidad especialidad;
        
        return especialidades;
    }
    
}
