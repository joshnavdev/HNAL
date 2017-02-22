
package CapaPersistencia.AteTriaje;

import CapaEntidades.AteTriaje.Medico;
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
public class Medico_AD {
    //DATOS PARA EL MANEJO DE LA BASE DE DATOS
    private final Connection conexion = new Conexion("HNAL","1234").getConexion();
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public ArrayList<Medico> listarMedicoEsp(String codEspecialidad) {
        ArrayList<Medico> medicos = new ArrayList<>();
        Medico medico;
        
        return medicos;
    }
}
