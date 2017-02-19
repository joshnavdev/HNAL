
package CapaPersistencia.Seguridad;

import CapaEntidades.Seguridad.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Joshua
 */
public class Usuario_AD {
    
    public ArrayList<Usuario> listarUsuarios(){
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario usuario;
        //Codigo...
        usuarios.add(new Usuario("US001","Joshua","Navarro","josnav","1234","Administrador"));
        usuarios.add(new Usuario("US002","Nicolas","Navarro","nicnav","1234","Encargado de Ventanilla"));
        return usuarios;
    }
    
    public String generarCodigo(){
        String codigo = "";
        //Codigo...
        codigo = "US001";
        return codigo;
    }
    
    public int guardarUsuario(Usuario usuario){
        int resp = 0;
        //Codigo...
        System.out.println(usuario.getCodigo() + " Agregado por AD");
        return resp;
    }
    
    public ArrayList<Usuario> buscarUsuarios(String cadena) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario usuario;
        //Codigo...
        usuarios.add(new Usuario("US003","Joshua","Navarro","josnav","1234","Administrador"));
        usuarios.add(new Usuario("US004","Joshua","Navarro","josnav","1234","Administrador"));
        return usuarios;
    }
    
    public int eliminarUsuario(String codigo) {
        int resp = 0;
        //Codigo... 
        System.out.println("ME ELIMINASTE :(");
        return resp;
    }
    
    public int modificarUsuario(Usuario usuario) {
        int resp = 0;
        //Codigo... 
        System.out.println("ME MODIFICASTE :$");
        return resp;
    }
    
    public String validarUsuario(String usuario, String clave) {
        String tipo = "";
        //Codigo... 
        if("josnav".equals(usuario) && "1234".equals(clave))
            tipo = "Administrador";
        return tipo;
    }
    
}
