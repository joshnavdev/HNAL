
package CapaPersistencia.AteTriaje;

import CapaEntidades.AteTriaje.Consulta;
import CapaPersistencia.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Joshua
 */
public class Consulta_AD {
    //DATOS PARA EL MANEJO DE LA BASE DE DATOS
    private final Connection conexion = new Conexion("HNAL","1234").getConexion();
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public String generarCodigo() {
        String codigo = null;
        
        return codigo;
    }
    
    public int crearConsulta(Consulta consulta) {
        int resp = 0;
        
        return resp;
    }
}
