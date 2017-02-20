
package CapaPersistencia.Seguridad;

import CapaEntidades.Seguridad.Usuario;
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
public class Usuario_AD {
    //DATOS PARA EL MANEJO DE LA BASE DE DATOS
    private final Connection conexion = new Conexion("HNAL","1234").getConexion();
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public ArrayList<Usuario> listarUsuarios(){
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario usuario;
        try {
            String sql = "EXEC listarUsuarios";
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()) {
                usuario = new Usuario(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                );
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            System.out.println("Error al ListarUsuarios");
            System.out.println(e.getMessage());
        }
        return usuarios;
    }
    
    public String generarCodigo(){
        String codigo = null;
        
        try {
            String sql = "EXEC genIdUsuario";
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next())
                codigo = rs.getString(1);
            
        } catch (SQLException e) {
            System.out.println("Error en genIdUsuario");
            System.out.println(e.getMessage());
        }
        
        return codigo;
    }
    
    public int guardarUsuario(Usuario usuario){
        int resp = 0;
        
        try {
            String sql = "EXEC guardarUsuario ?,?,?,?,?,?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, usuario.getCodigo());
            ps.setString(2, usuario.getNombre());
            ps.setString(3, usuario.getApellido());
            ps.setString(4, usuario.getUsuario());
            ps.setString(5, usuario.getClave());
            ps.setString(6, usuario.getTipo());
            resp = ps.executeUpdate();
            // 1 cuando esta todo bien
        } catch (SQLException e) {
            System.out.println("Error en guardarUsuario");
            System.out.println(e.getMessage());
        }
        
        return resp;
    }
    
    public ArrayList<Usuario> buscarUsuarios(String cadena) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario usuario;
        
        try {
            String sql = "EXEC buscarUsuario ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, cadena);
            rs = ps.executeQuery();
            while(rs.next()) {
                usuario = new Usuario(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                );
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            System.out.println("Error al buscarUsuarios");
            System.out.println(e.getMessage());
        }
        
        return usuarios;
    }
    
    public int eliminarUsuario(String codigo) {
        int resp = 0;
        try {
            String sql = "EXEC eliminarUsuario ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, codigo);
            resp = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminarUsuario");
            System.out.println(e.getMessage());
        }
        return resp;
    }
    
    public int modificarUsuario(Usuario usuario) {
        int resp = 0;
        
        try {
            String sql = "EXEC modificarUsuario ?,?,?,?,?,?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, usuario.getCodigo());
            ps.setString(2, usuario.getNombre());
            ps.setString(3, usuario.getApellido());
            ps.setString(4, usuario.getUsuario());
            ps.setString(5, usuario.getClave());
            ps.setString(6, usuario.getTipo());
            resp = ps.executeUpdate();
            // 1 cuando esta todo bien
        } catch (SQLException e) {
            System.out.println("Error en modificarUsuario");
            System.out.println(e.getMessage());
        }
        
        return resp;
    }
    
    public String validarUsuario(String usuario, String clave) {
        String tipo = null;
        try {
            String sql = "EXEC validarUsuario ?,?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, clave);
            rs = ps.executeQuery();
            if(rs.next())
                tipo = rs.getString(1);
            
        } catch (SQLException e) {
            System.out.println("error al validad usuario");
            System.out.println(e.getMessage());
        }
        return tipo;
    }
    
}
