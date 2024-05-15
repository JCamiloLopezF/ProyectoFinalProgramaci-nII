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

}
