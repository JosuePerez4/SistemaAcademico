package sistema.academico.entities;

import java.util.List;
import java.sql.Time;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {
    private String nombre;
    private String descripcion;
    private String codigo;
    private Materia materia;
    private int cupoMaximo;
    private int semestre;
    private Clase clase;
    private Calificacion calificacion;
    private Estudiante estudiante;

    void crearCurso() {
    }

    void modificarCurso() {
    }

    void eliminarCurso() {
    }

    void inscribirEstudiante(Estudiante estudiante) {
    }

    boolean agregarHorario(Horario horario) {
        return false;
    }

    boolean eliminarHorario(Horario horario) {
        return false;
    }

    List<Horario> listarHorarios() {
        return null;
    }

    List<Estudiante> listarEstudiantes() {
        return null;
    }

    boolean consultarDisponibilidad(String dia, Time hora) {
        return false;
    }
}
