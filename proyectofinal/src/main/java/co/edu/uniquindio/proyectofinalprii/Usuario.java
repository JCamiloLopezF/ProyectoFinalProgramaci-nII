package co.edu.uniquindio.proyectofinalprii;

public abstract class Usuario {
    private String nombre;
    private String codigo;
    private String telefono;
    private String correo;
    
    public Usuario(String nombre, String codigo, String telefono, String correo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
