
package CapaEntidades.Seguridad;

/**
 *
 * @author Joshua
 */
public class Usuario {
    
    private String codigo;
    private String nombre;
    private String apellido;
    private String usuario;
    private String clave;
    private String tipo;

    public String getCodigo() { return codigo; }

    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getUsuario() { return usuario; }

    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getClave() { return clave; }

    public void setClave(String clave) {  this.clave = clave;  }

    public String getTipo() { return tipo; }

    public void setTipo(String tipo) { this.tipo = tipo; }
    
    
}
