
package CapaEntidades.GesTicAtencion;

import CapaEntidades.Date;



/**
 *
 * @author Joshua
 */
public class TicketAtencion {
    
    private String codigo;
    private Date fecGenerada;

    public TicketAtencion(String codigo, Date fecGenerada) {
        this.codigo = codigo;
        this.fecGenerada = fecGenerada;
    }

    public String getCodigo() { return codigo; }

    public void setCodigo(String codigo) { this.codigo = codigo; }

    public Date getFecGenerada() { return fecGenerada; }

    public void setFecGenerada(Date fecGenerada) { this.fecGenerada = fecGenerada; }
    
    
}
