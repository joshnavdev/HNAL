
package CapaPersistencia.Seguridad;

import CapaEntidades.Seguridad.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Joshua
 */
public class Usuario_AD {
    
    public ArrayList<Usuario> listarUsuarios(){
        ArrayList<Usuario> Usuarios = new ArrayList<>();
        Usuario usuario;
        //Codigo...
        return Usuarios;
    }
    
    public String generarCodigo(){
        String codigo = "";
        //Codigo...
        return codigo;
    }
    
    public int guardarUsuario(Usuario usuario){
        int resp = 0;
        //Codigo...
        return resp;
    }
    
    public ArrayList<Usuario> buscarUsuarios(String cadena) {
        ArrayList<Usuario> Usuarios = new ArrayList<>();
        Usuario usuario;
        //Codigo...
        return Usuarios;
    }
    
    public int eliminarUsuario(String codigo) {
        int resp = 0;
        //Codigo... 
        return resp;
    }
    
    public int modificarUsuario(Usuario usuario) {
        int resp = 0;
        //Codigo... 
        return resp;
    }
    
    public boolean validarUsuario(String usuario, String clave) {
        boolean existe = false;
        //Codigo... 
        return existe;
    }
    
}
