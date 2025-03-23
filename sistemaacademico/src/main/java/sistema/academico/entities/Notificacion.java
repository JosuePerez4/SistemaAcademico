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
class Notificacion {
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
