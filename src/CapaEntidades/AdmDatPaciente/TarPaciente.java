
package CapaEntidades.AdmDatPaciente;

/**
 *
 * @author Joshua
 */
public class TarPaciente {
    private String nombre;
    private String direccion;
    private String movil;
    private String gSanguineo;

    public TarPaciente(String nombre, String direccion, String movil, String gSanguineo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.movil = movil;
        this.gSanguineo = gSanguineo;
    }

    @Override
    public String toString() {
        return "TarPaciente{" + "nombre=" + nombre + ", direccion=" + direccion + ", movil=" + movil + ", gSanguineo=" + gSanguineo + '}';
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getgSanguineo() {
        return gSanguineo;
    }

    public void setgSanguineo(String gSanguineo) {
        this.gSanguineo = gSanguineo;
    }
    
    
}
