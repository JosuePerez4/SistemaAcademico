package sistema.academico;


import java.util.Date;
import java.util.List;

public class Clase {
    private Date fecha;
    private Horario horario;
    private Asistencia asistencia;

    void anadirCurso() {
    }

    void cancelarClase() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Asistencia getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(Asistencia asistencia) {
        this.asistencia = asistencia;
    }
}
