
package CapaPersistencia.AteTriaje;

import CapaEntidades.AteTriaje.Consulta;
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
public class Consulta_AD {
    //DATOS PARA EL MANEJO DE LA BASE DE DATOS
    private final Connection conexion = new Conexion("HNAL","1234").getConexion();
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public String generarCodigo() {
        String codigo = null;
        
        try {
            String sql = "EXEC genIdConsulta";
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next())
                codigo = rs.getString(1);
            
        } catch (SQLException e) {
            System.out.println("Error genIdConsulta");
            System.out.println(e.getMessage());
        }
        
        return codigo;
    }
    
    public int crearConsulta(Consulta consulta) {
        int resp = 0;
            
        try {
            String sql = "EXEC crearConsulta ?,?,?";
            ps = conexion.prepareCall(sql);
            ps.setString(1, consulta.getCodConsulta());
            ps.setString(2, consulta.getCodMedico());
            ps.setString(3, consulta.getSintomas());
            resp = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error en crearConsulta");
            System.out.println(e.getMessage());
        }
        
        return resp;
    }
}
