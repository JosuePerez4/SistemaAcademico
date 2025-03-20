package sistema.academico;

import java.util.Date;

public class Asistencia {
    private Estado estado;
    private Estudiante estudiante;
    private Date fecha;

    public void registrarAsistencia() {
        // Lógica para registrar asistencia
    }

    public void generarReporteInasistencias() {
        // Lógica para generar un reporte de inasistencias
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}

