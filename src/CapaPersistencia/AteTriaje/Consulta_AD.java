
package CapaPersistencia.AteTriaje;

import CapaEntidades.AteTriaje.Consulta;
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
    
    public ArrayList<Consulta> listarConsultasHc(String codhisClinico) {
        ArrayList consultas = new ArrayList<>();
        Consulta consulta;
        try {
            String sql = "EXEC listarConsultasHc ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, codhisClinico);
            rs = ps.executeQuery();
            while(rs.next()) {
                consulta = new Consulta(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)
                );
                consultas.add(consulta);
            }
        } catch (SQLException e) {
            System.out.println("Error en listarConsultasHc");
            System.out.println(e.getMessage());
        }
        return consultas;
    }
    
    public int modificarConsultaHC(String codConsulta, String codHisClinico) {
        int resp = 0;
        try {
            String sql = "EXEC modificarConsultaHC ?,?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, codConsulta);
            ps.setString(2, codHisClinico);
            resp = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error en modificarConsultaHC");
            System.out.println(e.getMessage());
        }
        return resp;
    }
    // obteerEspMedico id_consulta
    public ArrayList<String> obteerEspMedico(String codConsulta) {
        ArrayList<String> espMedicos = new ArrayList<>();
        String nombre, especialidad;
        
        try {
            String sql = "EXEC obteerEspMedico ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, codConsulta);
            rs = ps.executeQuery();
            if(rs.next()) {
                nombre = rs.getString(1) + " " +rs.getString(2);
                especialidad = rs.getString(3);
                espMedicos.add(nombre);
                espMedicos.add(especialidad);
            }
            
        } catch (SQLException e) {
            System.out.println("Error en obteerEspMedico");
            System.out.println(e.getMessage());
        }
        
        return espMedicos;
    }
}
