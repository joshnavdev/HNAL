
package CapaNegocio.Seguridad;

import CapaEntidades.Seguridad.Usuario;
import CapaPersistencia.Seguridad.Usuario_AD;
import java.util.ArrayList;

/**
 *
 * @author Joshua
 */
public class Usuario_LN {
    
    public ArrayList<Usuario> listarUsuarios(){
        try {
            return new Usuario_AD().listarUsuarios();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public String generarCodigo(){
        try {
            return new Usuario_AD().generarCodigo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public int guardarUsuario(Usuario usuario) {
        try {
            return new Usuario_AD().guardarUsuario(usuario);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
    public ArrayList<Usuario> buscarUsuarios(String cadena) {
        try {
            return new Usuario_AD().buscarUsuarios(cadena);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public int eliminarUsuario(String codigo) {
        try {
            return new Usuario_AD().eliminarUsuario(codigo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
    public int modificarUsuario(Usuario usuario) {
        try {
            return new Usuario_AD().modificarUsuario(usuario);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
    public String validarUsuario(String usuario, String clave) {
        try {
            return new Usuario_AD().validarUsuario(usuario, clave);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
}
