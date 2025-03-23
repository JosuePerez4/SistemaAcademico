package sistema.academico.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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