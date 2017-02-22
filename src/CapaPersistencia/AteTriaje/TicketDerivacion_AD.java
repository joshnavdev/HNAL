
package CapaPersistencia.AteTriaje;

import CapaEntidades.AteTriaje.TicketDerivacion;
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
public class TicketDerivacion_AD {
    //DATOS PARA EL MANEJO DE LA BASE DE DATOS
    private final Connection conexion = new Conexion("HNAL","1234").getConexion();
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public String generarCodigo() {
        String codigo = null;
        
        try {
            String sql = "EXEC genIdTicDerivacion";
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next())
                codigo = rs.getString(1);
            
        } catch (SQLException e) {
            System.out.println("Error en genIdTicDerivacion");
            System.out.println(e.getMessage());
        }
        
        return codigo;
    }
    
    public int guardarTicDerivacion(TicketDerivacion ticket) {
        int resp = 0;
        
        try {
            String sql = "EXEC guardarTicDerivacion ?,?";
            ps = conexion.prepareCall(sql);
            ps.setString(1, ticket.getCodTicket());
            ps.setString(2, ticket.getCodConsulta());
            resp = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error en guardarTicDerivacion");
            System.out.println(e.getMessage());
        }
        
        return resp;
    }
}
