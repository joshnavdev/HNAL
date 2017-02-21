
package CapaPersistencia.GesTicAtencion;

import CapaEntidades.GesTicAtencion.TicketAtencion;
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
public class TicketAtencion_AD {
    //DATOS PARA EL MANEJO DE LA BASE DE DATOS
    private final Connection conexion = new Conexion("HNAL","1234").getConexion();
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public String generarCodigo() {
        String codigo = null;
        
        try {
            String sql = "EXEC genIdTicket";
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next())
                codigo = rs.getString(1);
            
        } catch (SQLException e) {
            System.out.println("Error en genIdTicket");
            System.out.println(e.getMessage());
        }
        
        return codigo;
    }
    
    public int guardarTickeAtencion(TicketAtencion ticket) {
        int resp = 0;
        
        try {
            String sql = "EXC guardarTicket ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, ticket.getCodigo());
            resp = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error en guardarTicketAtenciom");
            System.out.println(e.getMessage());
        }
        
        return resp;
    }
}
