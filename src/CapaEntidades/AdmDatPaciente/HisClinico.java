
package CapaEntidades.AdmDatPaciente;

/**
 *
 * @author Joshua
 */
public class HisClinico {
    private String codHisClinico;
    private String estado;
    private String gSanguineo;
    private String antPersonales;
    private String alergias;
    private String vacunas;
    private String intQuirurgicas;
    private String enfCronicas;
    private String codPaciente;
    private String antFamiliares;

    public HisClinico(String codHisClinico, String estado, String gSanguineo, String antPersonales, String alergias, String vacunas, String intQuirurgicas, String enfCronicas, String codPaciente, String antFamiliares) {
        this.codHisClinico = codHisClinico;
        this.estado = estado;
        this.gSanguineo = gSanguineo;
        this.antPersonales = antPersonales;
        this.alergias = alergias;
        this.vacunas = vacunas;
        this.intQuirurgicas = intQuirurgicas;
        this.enfCronicas = enfCronicas;
        this.codPaciente = codPaciente;
        this.antFamiliares = antFamiliares;
    }

    public String getCodHisClinico() {
        return codHisClinico;
    }

    public void setCodHisClinico(String codHisClinico) {
        this.codHisClinico = codHisClinico;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getgSanguineo() {
        return gSanguineo;
    }

    public void setgSanguineo(String gSanguineo) {
        this.gSanguineo = gSanguineo;
    }

    public String getAntPersonales() {
        return antPersonales;
    }

    public void setAntPersonales(String antPersonales) {
        this.antPersonales = antPersonales;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getVacunas() {
        return vacunas;
    }

    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }

    public String getIntQuirurgicas() {
        return intQuirurgicas;
    }

    public void setIntQuirurgicas(String intQuirurgicas) {
        this.intQuirurgicas = intQuirurgicas;
    }

    public String getEnfCronicas() {
        return enfCronicas;
    }

    public void setEnfCronicas(String enfCronicas) {
        this.enfCronicas = enfCronicas;
    }

    public String getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(String codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getAntFamiliares() {
        return antFamiliares;
    }

    public void setAntFamiliares(String antFamiliares) {
        this.antFamiliares = antFamiliares;
    }
    
    
    
}
