
package CapaEntidades.AteTriaje;

/**
 *
 * @author Joshua
 */
public class Especialidad {
    
    private String codEspecialidad;
    private String codPabellon;
    private String nombre;
    private String descripcion;

    public Especialidad(String codEspecialidad, String codPabellon, String nombre, String descripcion) {
        this.codEspecialidad = codEspecialidad;
        this.codPabellon = codPabellon;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getCodEspecialidad() {
        return codEspecialidad;
    }

    public void setCodEspecialidad(String codEspecialidad) {
        this.codEspecialidad = codEspecialidad;
    }

    public String getCodPabellon() {
        return codPabellon;
    }

    public void setCodPabellon(String codPabellon) {
        this.codPabellon = codPabellon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
