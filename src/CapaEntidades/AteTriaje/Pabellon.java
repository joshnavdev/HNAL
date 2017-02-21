
package CapaEntidades.AteTriaje;

/**
 *
 * @author Joshua
 */
public class Pabellon {
    
    private String codPabellon;
    private String nombre;
    private String descripcion;

    public Pabellon(String codPabellon, String nombre, String descripcion) {
        this.codPabellon = codPabellon;
        this.nombre = nombre;
        this.descripcion = descripcion;
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
