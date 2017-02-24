
package CapaPersistencia.AdmDatPaciente;

import CapaEntidades.AdmDatPaciente.Receta;
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
public class Receta_AD {
    //DATOS PARA EL MANEJO DE LA BASE DE DATOS
    private final Connection conexion = new Conexion("HNAL","1234").getConexion();
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public Receta buscarReceta(String codReceta) {
        Receta receta = null;
        try {
            String sql = "Exec buscarReceta ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, codReceta);
            rs = ps.executeQuery();
            if(rs.next()) {
                receta = new Receta(
                        rs.getString(1),
                        rs.getString(1),
                        rs.getString(1)
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al buscarReceta");
            System.out.println(e.getMessage());
        }
        return receta;
    }
}
