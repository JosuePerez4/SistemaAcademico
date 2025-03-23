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
public class Estudiante {
    private String programaAcademico;
    private float promedio;
    private boolean beca;
    private Date fechaIngreso;
    private Date fechaEgreso;
    private Curso curso;
}