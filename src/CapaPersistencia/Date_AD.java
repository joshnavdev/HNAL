
package CapaPersistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Joshua
 */
public class Date_AD {
    //DATOS PARA EL MANEJO DE LA BASE DE DATOS
    private final Connection conexion = new Conexion("HNAL","1234").getConexion();
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public String obtenerFecha() {
        String fecha = null;
        
        try {
            String sql = "EXEC obtenerFecha";
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next())
                fecha = rs.getString(1);
            
        } catch (SQLException e) {
            System.out.println("Error en obtenerFecha");
            System.out.println(e.getMessage());
        }
        
        return fecha;
    }

    public String obtenerFechaHora() {
        String fechaHora = null;
        
        try {
            String sql = "EXEC obtenerFechaHora";
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next())
                fechaHora = rs.getString(1);
            
        } catch (SQLException e) {
            System.out.println("Error en obtenerFechaHora");
            System.out.println(e.getMessage());
        }
        
        return fechaHora;
    }
    
}
