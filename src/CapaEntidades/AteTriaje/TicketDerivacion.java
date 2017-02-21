
package CapaEntidades.AteTriaje;

/**
 *
 * @author Joshua
 */
public class TicketDerivacion {
    
    private String codTicket;
    private String codConsulta;

    public TicketDerivacion(String codTicket, String codConsulta) {
        this.codTicket = codTicket;
        this.codConsulta = codConsulta;
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
    
    
    
}
