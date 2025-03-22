package sistema.academico;

import java.util.Date;

class Reporte {
    private String titulo;
    private String tipo;
    private Date fechaGeneracion;
    private String descripcion;
    private Usuario autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public boolean generarReporte() {
        // Lógica para generar el reporte
        return true;
    }

    public void descargarReporte() {
        // Lógica para descargar el reporte
    }

    public boolean eliminarReporte() {
        // Lógica para eliminar el reporte
        return true;
    }

    public boolean modificarReporte(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
        return true;
    }
}
