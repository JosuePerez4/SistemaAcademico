package sistema.academico.entities;

import java.util.Date;

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
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
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