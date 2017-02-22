
package CapaEntidades.AteTriaje;

/**
 *
 * @author Joshua
 */
public class TicketDerivacion {
    
    private String codTicket;
    private String codConsulta;
    private String fecha;

    public TicketDerivacion(String codTicket, String codConsulta, String fecha) {
        this.codTicket = codTicket;
        this.codConsulta = codConsulta;
        this.fecha = fecha;
    }

    public String getCodTicket() {
        return codTicket;
    }

    public void setCodTicket(String codTicket) {
        this.codTicket = codTicket;
    }

    public String getCodConsulta() {
        return codConsulta;
    }

    public void setCodConsulta(String codConsulta) {
        this.codConsulta = codConsulta;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
