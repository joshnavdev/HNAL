
package CapaPersistencia.AteTriaje;

import CapaPersistencia.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        
        try {
            String sql = "EXEC buscarNomPabellon ?";
            ps = conexion.prepareCall(sql);
            ps.setString(1, codPabellon);
            rs = ps.executeQuery();
            if(rs.next())
                nombre = rs.getString(1);
            
        } catch (SQLException e) {
            System.out.println("Error en buscarNomPabellon");
            System.out.println(e.getMessage());
        }
        
        return nombre;
    }
}
