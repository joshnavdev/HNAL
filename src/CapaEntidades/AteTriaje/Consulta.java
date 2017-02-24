
package CapaEntidades.AteTriaje;

/**
 *
 * @author Joshua
 */
public class Consulta {
    private String codConsulta;
    private String codHisClinico;
    private String codMedico;
    private String codReceta;
    private String fechaEmision;
    private String sintomas;
    private String diagnostico;

    public Consulta(String codConsulta, String codHisClinico, String codMedico, String codReceta, String fechaEmision, String sintomas, String diagnostico) {
        this.codConsulta = codConsulta;
        this.codHisClinico = codHisClinico;
        this.codMedico = codMedico;
        this.codReceta = codReceta;
        this.fechaEmision = fechaEmision;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
    }

    public Consulta(String codConsulta, String codMedico, String sintomas) {
        this.codConsulta = codConsulta;
        this.codHisClinico = null;
        this.codMedico = codMedico;
        this.codReceta = null;
        this.fechaEmision = null;
        this.sintomas = sintomas;
        this.diagnostico = null;
    }

    public Consulta(String codConsulta, String fechaEmision, String sintomas, String diagnostico, String codReceta) {
        this.codConsulta = codConsulta;
        this.codReceta = codReceta;
        this.fechaEmision = fechaEmision;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        return "Consulta{" + "codConsulta=" + codConsulta + ", codHisClinico=" + codHisClinico + ", codMedico=" + codMedico + ", codReceta=" + codReceta + ", fechaEmision=" + fechaEmision + ", sintomas=" + sintomas + ", diagnostico=" + diagnostico + '}';
    }
    
    

    public String getCodConsulta() {
        return codConsulta;
    }

    public void setCodConsulta(String codConsulta) {
        this.codConsulta = codConsulta;
    }

    public String getCodHisClinico() {
        return codHisClinico;
    }

    public void setCodHisClinico(String codHisClinico) {
        this.codHisClinico = codHisClinico;
    }

    public String getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(String codMedico) {
        this.codMedico = codMedico;
    }

    public String getCodReceta() {
        return codReceta;
    }

    public void setCodReceta(String codReceta) {
        this.codReceta = codReceta;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    
    
}
