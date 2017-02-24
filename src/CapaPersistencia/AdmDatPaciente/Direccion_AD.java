
package CapaPersistencia.AdmDatPaciente;

import CapaEntidades.AdmDatPaciente.Direccion;
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
public class Direccion_AD {
    //DATOS PARA EL MANEJO DE LA BASE DE DATOS
    private final Connection conexion = new Conexion("HNAL","1234").getConexion();
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public ArrayList<String> listarDepartamento() {
        ArrayList<String> departamentos = new ArrayList<>();
        String departamento;
        
        try {
            String sql = "EXEC listarDepartamento";
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()) {
                departamento = rs.getString(1);
                departamentos.add(departamento);
            }
        } catch (SQLException e) {
            System.out.println("Error listarDepartamento");
            System.out.println(e.getMessage());
        }
        
        return departamentos;
    }
    
    public ArrayList<String> listarProvinciaDep(String codDepartamento) {
        ArrayList<String> provincias = new ArrayList<>();
        String provincia;
        
        try {
            String sql = "EXEC listarProvinciaDep ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, codDepartamento);
            rs = ps.executeQuery();
            while(rs.next()) {
                provincia = rs.getString(1);
                provincias.add(provincia);
            }
            
        } catch (SQLException e) {
            System.out.println("Error listarProvinciaDep");
            System.out.println(e.getMessage());
        }
        
        return provincias;
    }
    
    public ArrayList<String> listaDistritoPro(String codProvincia) {
        ArrayList<String> distritos = new ArrayList<>();
        String distrito;
        try {
            String sql = "EXEC listarDistritoPro ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, codProvincia);
            rs = ps.executeQuery();
            while(rs.next()) {
                distrito = rs.getString(1);
                distritos.add(distrito);
            }
            
        } catch (SQLException e) {
            System.out.println("Error listarDistritoPro");
            System.out.println(e.getMessage());
        }
        return distritos;
    }
    
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
