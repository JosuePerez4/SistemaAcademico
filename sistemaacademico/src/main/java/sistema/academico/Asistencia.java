package sistema.academico;

import java.util.Date;

import jakarta.persistence.*;

public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

