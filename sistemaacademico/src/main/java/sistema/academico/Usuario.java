package sistema.academico;

import java.util.Date;

public class Usuario {
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private String telefono;
    private String genero;
    private Date fechaNacimiento;
    private String codigo;
    private String contrasena;
    private boolean estado;
    private String rol;

    public Usuario(String cedula, String nombre, String apellido, String direccion, String correo, String telefono,
            String genero, Date fechaNacimiento, String codigo, String contrasena, boolean estado, String rol) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.codigo = codigo;
        this.contrasena = contrasena;
        this.estado = estado;
        this.rol = rol;
    }

    // Getters y Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    // Métodos
    public boolean iniciarSesion(String email, String contrasena) {
        return this.correo.equals(email) && this.contrasena.equals(contrasena);
    }

    public void cerrarSesion() {
        System.out.println("Sesión cerrada exitosamente.");
    }

    public void recuperarContrasena() {
        System.out.println("Se ha enviado un correo de recuperación a: " + correo);
    }

    public boolean cambiarContrasena(String contrasenaActual, String nuevaContrasena) {
        if (this.contrasena.equals(contrasenaActual)) {
            this.contrasena = nuevaContrasena;
            return true;
        }
        return false;
    }
}