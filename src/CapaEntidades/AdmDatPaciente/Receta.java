
package CapaEntidades.AdmDatPaciente;

/**
 *
 * @author Joshua
 */
public class Receta {
    private String codReceta;
    private String medicamento;
    private String tratamiento;

    public Receta(String codReceta, String medicamento, String tratamiento) {
        this.codReceta = codReceta;
        this.medicamento = medicamento;
        this.tratamiento = tratamiento;
    }

    public String getCodReceta() {
        return codReceta;
    }

    public void setCodReceta(String codReceta) {
        this.codReceta = codReceta;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    
    
}
