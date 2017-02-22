
package CapaPersistencia.AteTriaje;

import CapaEntidades.AteTriaje.Especialidad;
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
public class Especialidad_AD {
    //DATOS PARA EL MANEJO DE LA BASE DE DATOS
    private final Connection conexion = new Conexion("HNAL","1234").getConexion();
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public ArrayList<Especialidad> listarEspecialidad() {
        ArrayList<Especialidad> especialidades = new ArrayList<>();
        Especialidad especialidad;
        
        try {
            String sql = "EXEC listarEspecialidad";
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()) {
                especialidad = new Especialidad(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
                especialidades.add(especialidad);
            }
            
        } catch (SQLException e) {
            System.out.println("Error al listarEspecialidad");
            System.out.println(e.getMessage());
        }
        
        return especialidades;
    }
    
}
