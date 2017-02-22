
package CapaEntidades.AteTriaje;

/**
 *
 * @author Joshua
 */
public class Medico {
    
    private String codMedico;
    private String nombre;
    private String apellido;
    private String dni;
    private String codEspecialidad;
    private String sexo;
    private String telefono;
    private String codDireccion;

    public Medico(String codMedico, String nombre, String apellido, String dni, String codEspecialidad, String sexo, String telefono, String codDireccion) {
        this.codMedico = codMedico;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.codEspecialidad = codEspecialidad;
        this.sexo = sexo;
        this.telefono = telefono;
        this.codDireccion = codDireccion;
    }

    @Override
    public String toString(){
        return this.nombre + ' ' + this.apellido;
    }
    
    public String getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(String codMedico) {
        this.codMedico = codMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCodEspecialidad() {
        return codEspecialidad;
    }

    public void setCodEspecialidad(String codEspecialidad) {
        this.codEspecialidad = codEspecialidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodDireccion() {
        return codDireccion;
    }

    public void setCodDireccion(String codDireccion) {
        this.codDireccion = codDireccion;
    }
    
    
    
}
