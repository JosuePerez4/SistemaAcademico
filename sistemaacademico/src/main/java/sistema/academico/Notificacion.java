package sistema.academico;

import java.util.Date;

class Notificacion {
    private String destinatario;
    private Mensaje mensaje;
    private Date fechaCreacion;
    private Usuario usuarioDestino;

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public Mensaje getMensaje() {
        return mensaje;
    }

    public void setMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Usuario getUsuarioDestino() {
        return usuarioDestino;
    }

    public void setUsuarioDestino(Usuario usuarioDestino) {
        this.usuarioDestino = usuarioDestino;
    }

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
