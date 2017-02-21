
package CapaEntidades.GesTicAtencion;

import CapaEntidades.Date;

/**
 *
 * @author Joshua
 */
public class Factura {
    
    private String codFactura;
    private String codUsuario;
    private String codTicket;
    private Date fechGenerada;
    private String nomCliente;
    private String dniCliente;
    private String monto;

    public Factura(String codFactura, String codUsuario, String codTicket, Date fechGenerada, String nomCliente, String dniCliente, String monto) {
        this.codFactura = codFactura;
        this.codUsuario = codUsuario;
        this.codTicket = codTicket;
        this.fechGenerada = fechGenerada;
        this.nomCliente = nomCliente;
        this.dniCliente = dniCliente;
        this.monto = monto;
    }

    public Factura(String codUsuario, String codTicket, String nomCliente, String dniCliente, String monto) {
        this.codFactura = null;
        this.codUsuario = codUsuario;
        this.codTicket = codTicket;
        this.fechGenerada = null;
        this.nomCliente = nomCliente;
        this.dniCliente = dniCliente;
        this.monto = monto;
    }
    
    

    public String getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(String codFactura) {
        this.codFactura = codFactura;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getCodTicket() {
        return codTicket;
    }

    public void setCodTicket(String codTicket) {
        this.codTicket = codTicket;
    }

    public Date getFechGenerada() {
        return fechGenerada;
    }

    public void setFechGenerada(Date fechGenerada) {
        this.fechGenerada = fechGenerada;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }
    
    
    
}
