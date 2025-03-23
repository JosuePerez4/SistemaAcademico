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
class Mensaje {
    private Usuario remitente;
    private Usuario destinatario;
    private String contenido;
    private Date fechaEnvio;

    public boolean enviarMensaje(Usuario destinatario, String contenido) {
        // Lógica para enviar el mensaje
        return true;
    }

    public void marcarComoLeido() {
        // Lógica para marcar como leído
    }

    public void eliminarMensaje() {
        // Lógica para eliminar el mensaje
    }

    public String obtenerDetallesMensaje() {
        return "De: " + remitente + ", Para: " + destinatario + ", Contenido: " + contenido;
    }
}
