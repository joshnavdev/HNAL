
package CapaPersistencia.AteTriaje;

import CapaEntidades.AteTriaje.Medico;
import CapaPersistencia.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Joshua
 */
public class Medico_AD {
    //DATOS PARA EL MANEJO DE LA BASE DE DATOS
    private final Connection conexion = new Conexion("HNAL","1234").getConexion();
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public ArrayList<Medico> listarMedicoEsp(String codEspecialidad) {
        ArrayList<Medico> medicos = new ArrayList<>();
        Medico medico;
        
        try {
            String sql = "EXEC listarMedicoEsp";
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()) {
                medico = new Medico(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6).charAt(0),
                        rs.getString(7),
                        rs.getString(8)
                );
                medicos.add(medico);
            }
            
        } catch (SQLException e) {
            System.out.println("Error en listarMedicoEsp");
            System.out.println(e.getMessage());
        }
        
        return medicos;
    }
}
