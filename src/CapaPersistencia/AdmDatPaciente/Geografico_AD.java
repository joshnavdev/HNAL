
package CapaPersistencia.AdmDatPaciente;

import CapaEntidades.AdmDatPaciente.Geografico;
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
public class Geografico_AD {
    //DATOS PARA EL MANEJO DE LA BASE DE DATOS
    private final Connection conexion = new Conexion("HNAL","1234").getConexion();
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public ArrayList<Geografico> listarDepartamento() {
        ArrayList<Geografico> departamentos = new ArrayList<>();
        Geografico departamento;
        
        try {
            String sql = "EXEC listarDepartamento";
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()) {
                departamento = new Geografico(
                        rs.getString(1),
                        rs.getString(2)
                );
                departamentos.add(departamento);
            }
        } catch (SQLException e) {
            System.out.println("Error listarDepartamento");
            System.out.println(e.getMessage());
        }
        
        return departamentos;
    }
    
    public ArrayList<Geografico> listarProvinciaDep(String codDepartamento) {
        ArrayList<Geografico> provincias = new ArrayList<>();
        Geografico provincia;
        
        try {
            String sql = "EXEC listarProvinciaDep ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, codDepartamento);
            rs = ps.executeQuery();
            while(rs.next()) {
                provincia = new Geografico(
                        rs.getString(1),
                        rs.getString(2)
                );
                provincias.add(provincia);
            }
            
        } catch (SQLException e) {
            System.out.println("Error listarProvinciaDep");
            System.out.println(e.getMessage());
        }
        
        return provincias;
    }
    
    public ArrayList<Geografico> listaDistritoPro(String codProvincia) {
        ArrayList<Geografico> distritos = new ArrayList<>();
        Geografico distrito;
        try {
            String sql = "EXEC listarDistritoProv ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, codProvincia);
            rs = ps.executeQuery();
            while(rs.next()) {
                distrito = new Geografico(
                        rs.getString(1),
                        rs.getString(2)
                );
                distritos.add(distrito);
            }
            
        } catch (SQLException e) {
            System.out.println("Error listarDistritoPro");
            System.out.println(e.getMessage());
        }
        return distritos;
    }
}
