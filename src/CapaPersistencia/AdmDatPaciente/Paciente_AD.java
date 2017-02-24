
package CapaPersistencia.AdmDatPaciente;

import CapaEntidades.AdmDatPaciente.Paciente;
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
public class Paciente_AD {
    //DATOS PARA EL MANEJO DE LA BASE DE DATOS
    private final Connection conexion = new Conexion("HNAL","1234").getConexion();
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public int guardarPaciente(Paciente paciente) {
        int resp = 0;
        
        try {
            String sql = "EXEC guardarPaciente ?,?,?,?,?,?,?,?,?,?,?,?,?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellidoP());
            ps.setString(3, paciente.getApellidoM());
            ps.setString(4, paciente.getEstCivil());
            ps.setString(5, paciente.getSexo());
            ps.setString(6, paciente.getFecNacimiento());
            ps.setString(7, paciente.getEdad());
            ps.setString(8, paciente.getTelefono());
            ps.setString(9, paciente.getMovil());
            ps.setString(10, paciente.getDireccion());
            ps.setString(11, paciente.getCodDistrito());
            ps.setString(12, paciente.getCorreo());
            ps.setString(13, paciente.getDni());
            resp = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error guardarPaciente");
            System.out.println(e.getMessage());
        }
        
        return resp;
    }
    
    public Paciente buscarPacienteDNI(String dni) {
        Paciente paciente = null;
        try {
            String sql = "EXEC buscarPacienteDNI ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            if(rs.next()) {
                paciente = new Paciente(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13)
                );
            }
        } catch (SQLException e) {
            System.out.println("Error buscarPacienteDNI");
            System.out.println(e.getMessage());
        }
        return paciente;
    }
    
}
