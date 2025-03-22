package sistema.academico;

import java.util.Date;

class Mensaje {
    private Usuario remitente;
    private Usuario destinatario;
    private String contenido;
    private Date fechaEnvio;

    public Usuario getRemitente() {
        return remitente;
    }

    public void setRemitente(Usuario remitente) {
        this.remitente = remitente;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

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
