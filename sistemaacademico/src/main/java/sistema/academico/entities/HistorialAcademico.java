package sistema.academico.entities;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistorialAcademico {
    private String codigoEstudiante;  // Se usa el código del estudiante como id del historial académico
    private Estudiante estudiante;
    private List<Calificacion> calificaciones;
    private List<Curso> cursosAprobados;
    private List<Curso> cursosReprobados;
    private float promedioGeneral;
    private int creditosAcumulados;
}
