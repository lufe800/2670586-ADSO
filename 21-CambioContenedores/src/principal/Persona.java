package utils;

public class Persona {
    
    String cedula;
    String nombres;
    String apellidos;
    String direccion;
    String telefono;
    String correo;

    public Persona(String documento, String nombres, String apellidos, String direccion, String telefono, String correo) {
        this.cedula = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getDocumento() {
        return cedula;
    }

    public void setDocumento(String documento) {
        this.cedula = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
