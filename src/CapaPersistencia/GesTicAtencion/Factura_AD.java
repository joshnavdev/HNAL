
package CapaPersistencia.GesTicAtencion;

import CapaEntidades.GesTicAtencion.Factura;
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
public class Factura_AD {
    //DATOS PARA EL MANEJO DE LA BASE DE DATOS
    private final Connection conexion = new Conexion("HNAL","1234").getConexion();
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public int guardarFactura(Factura factura) {
        int resp = 0;
        
        try {
            String sql = "EXEC guardarFactura ?,?,?,?,?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, factura.getCodUsuario());
            ps.setString(2, factura.getCodTicket());
            ps.setString(3, factura.getNomCliente());
            ps.setString(4, factura.getDniCliente());
            ps.setString(5, factura.getMonto());
            resp = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error en guardarFactura");
            System.out.println(e.getMessage());
        }
        
        return resp;
    }
    
}
