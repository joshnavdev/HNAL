
package CapaPersistencia.AdmDatPaciente;

import CapaEntidades.AdmDatPaciente.HisClinico;
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
public class HisClinico_AD {
    //DATOS PARA EL MANEJO DE LA BASE DE DATOS
    private final Connection conexion = new Conexion("HNAL","1234").getConexion();
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public String generarCodigo() {
        String codigo = null;
        
        try {
            String sql = "EXEC genIdHisClinico";
            rs = conexion.createStatement().executeQuery(sql);
            if(rs.next())
                codigo = rs.getString(1);
            
        } catch (SQLException e) {
            System.out.println("error generarCodigoHC");
            System.out.println(e.getMessage());
        }
        
        return codigo;
    }
    
    public int guardarHisClinico(HisClinico hisClinico) {
        int resp = 0;
        
        try {
            String sql = "EXEC guardarHisClinico ?,?,?,?,?,?,?,?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, hisClinico.getEstado());
            ps.setString(1, hisClinico.getgSanguineo());
            ps.setString(1, hisClinico.getAntPersonales());
            ps.setString(1, hisClinico.getAntFamiliares());
            ps.setString(1, hisClinico.getAlergias());
            ps.setString(1, hisClinico.getVacunas());
            ps.setString(1, hisClinico.getIntQuirurgicas());
            ps.setString(1, hisClinico.getEnfCronicas());
            resp = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("error guardarHisClinico");
            System.out.println(e.getMessage());
        }
        
        return resp;
    }
    
    public HisClinico buscarHisClinicoPac(String codPaciente) {
        HisClinico hisClinico = null;
        try {
            String sql = "EXEC buscarHisClinico ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, codPaciente);
            rs = ps.executeQuery();
            if(rs.next()){
                hisClinico = new HisClinico(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10)
                );
            
            }
        } catch (SQLException e) {
            System.out.println("error buscarHisClinicoPac");
            System.out.println(e.getMessage());
        }
        return hisClinico;
    }
}
