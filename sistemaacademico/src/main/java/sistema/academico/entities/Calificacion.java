package sistema.academico.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calificacion {
    private Curso curso;
    private Estudiante estudiante;
    private float nota;
    private Date fechaRegistro;
    private String tipoEvaluacion;

    void modificarNota(float nuevaNota) {
    }

    String obtenerDetalles() {
        return "";
    }
}