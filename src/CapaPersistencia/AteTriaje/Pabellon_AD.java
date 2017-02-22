
package CapaPersistencia.AteTriaje;

import CapaPersistencia.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Joshua
 */
public class Pabellon_AD {
    //DATOS PARA EL MANEJO DE LA BASE DE DATOS
    private final Connection conexion = new Conexion("HNAL","1234").getConexion();
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public String buscarNomPabellon(String codPabellon) {
        String nombre = null;
        
        
        return nombre;
    }
}
