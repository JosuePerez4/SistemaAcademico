package sistema.academico;

import java.util.Date;
import java.util.List;

public class Semestre {
    String nombre;
    Date fechaInicio;
    Date fechaFin;
    List<Materia> materias;

    List<Materia> listarMateriasSemestre() {
        return null;
    }

    boolean agregarMateria(Materia materia) {
        return false;
    }

    boolean eliminarMateria(Materia materia) {
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
}