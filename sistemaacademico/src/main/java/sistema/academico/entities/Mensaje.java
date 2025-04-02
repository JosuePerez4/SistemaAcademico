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
class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
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
