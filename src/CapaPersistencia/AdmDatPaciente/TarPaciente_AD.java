
package CapaPersistencia.AdmDatPaciente;

import CapaEntidades.AdmDatPaciente.TarPaciente;
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
public class TarPaciente_AD {
    //DATOS PARA EL MANEJO DE LA BASE DE DATOS
    private final Connection conexion = new Conexion("HNAL","1234").getConexion();
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public TarPaciente genTarPaciente(String codConsulta) {
        TarPaciente tarjeta = null;
        try {
            String sql = "EXEC generarTarPaciente ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, codConsulta);
            rs = ps.executeQuery();
            if(rs.next()) {
                tarjeta = new TarPaciente(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al generarTarPaciente");
            System.out.println(e.getMessage());
        }
        return tarjeta;
    }
}
