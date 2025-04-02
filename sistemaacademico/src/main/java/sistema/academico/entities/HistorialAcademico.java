package sistema.academico.entities;

import java.util.List;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistorialAcademico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Estudiante estudiante;
    private List<Calificacion> calificaciones;
    private List<Curso> cursosAprobados;
    private List<Curso> cursosReprobados;
    private float promedioGeneral;
    private int creditosAcumulados;
}
