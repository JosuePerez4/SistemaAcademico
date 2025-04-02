package sistema.academico.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
class Notificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String destinatario;
    private Mensaje mensaje;
    private Date fechaCreacion;
    private Usuario usuarioDestino;

    public void enviarNotificacion() {
        // Lógica para enviar notificación
    }

    public void marcarComoLeida() {
        // Lógica para marcar notificación como leída
    }

    public void eliminarNotificacion() {
        // Lógica para eliminar notificación
    }
}
