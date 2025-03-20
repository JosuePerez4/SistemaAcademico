package sistema.academico;


import java.util.Date;
import java.util.List;

public class Clase {
    Date fecha;
    Horario horario;
    List<Asistencia> asistencias;

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

    public List<Asistencia> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(List<Asistencia> asistencias) {
        this.asistencias = asistencias;
    }
}
