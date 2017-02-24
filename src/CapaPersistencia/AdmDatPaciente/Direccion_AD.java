
package CapaPersistencia.AdmDatPaciente;

import CapaEntidades.AdmDatPaciente.Direccion;
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
public class Direccion_AD {
    //DATOS PARA EL MANEJO DE LA BASE DE DATOS
    private final Connection conexion = new Conexion("HNAL","1234").getConexion();
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public Direccion buscarDireccion(String codDireccion) {
        Direccion direccion = null;
        
        try {
            String sql = "EXEC buscarDireccion ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, codDireccion);
            rs = ps.executeQuery();
            if(rs.next()) {
                direccion = new Direccion(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );                
            }
            
        } catch (SQLException e) {
            System.out.println("Error buscarDireccion");
            System.out.println(e.getMessage());
        }
        
        return direccion;
    }
}
