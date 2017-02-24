
package CapaEntidades.AdmDatPaciente;

/**
 *
 * @author Joshua
 */
public class Paciente {
    private String codPaciente;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String estCivil;
    private String sexo;
    private String fecNacimiento;
    private String edad;
    private String telefono;
    private String movil;
    private String Direccion;
    private String codDistrito;
    private String correo;
    private String dni;

    public Paciente() {
    }

    public Paciente(String codPaciente, String nombre, String apellidoP, String apellidoM, String estCivil, String sexo, String fecNacimiento, String edad, String telefono, String movil, String Direccion, String codDistrito, String correo, String dni) {
        this.codPaciente = codPaciente;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.estCivil = estCivil;
        this.sexo = sexo;
        this.fecNacimiento = fecNacimiento;
        this.edad = edad;
        this.telefono = telefono;
        this.movil = movil;
        this.Direccion = Direccion;
        this.codDistrito = codDistrito;
        this.correo = correo;
        this.dni = dni;
    }

    public Paciente(String nombre, String apellidoP, String apellidoM, String estCivil, String sexo, String fecNacimiento, String edad, String telefono, String movil, String Direccion, String codDistrito, String correo, String dni) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.estCivil = estCivil;
        this.sexo = sexo;
        this.fecNacimiento = fecNacimiento;
        this.edad = edad;
        this.telefono = telefono;
        this.movil = movil;
        this.Direccion = Direccion;
        this.codDistrito = codDistrito;
        this.correo = correo;
        this.dni = dni;
    }

    

    @Override
    public String toString() {
        return "Paciente{" + "codPaciente=" + codPaciente + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", estCivil=" + estCivil + ", sexo=" + sexo + ", fecNacimiento=" + fecNacimiento + ", edad=" + edad + ", telefono=" + telefono + ", movil=" + movil + ", Direccion=" + Direccion + ", codDistrito=" + codDistrito + ", correo=" + correo + ", dni=" + dni + '}';
    }
    
    
    

    public String getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(String codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFecNacimiento() {
        return fecNacimiento;
    }

    public void setFecNacimiento(String fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCodDistrito() {
        return codDistrito;
    }

    public void setCodDistrito(String codDistrito) {
        this.codDistrito = codDistrito;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    

    
    
    
}
