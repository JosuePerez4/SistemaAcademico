
package sistema.academico.entities;

import java.util.Date;
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
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date fechaMatricula;
    private String estado;
    private Estudiante estudiante;
    private Semestre semestre;
    private Curso cursoInscrito;

    boolean registrarMatricula(Estudiante estudiante, Semestre semestre, List<Curso> cursos) {
        return false;
    }

    boolean cancelarMatricula() {
        return false;
    }

    List<Curso> listarCursosInscritos() {
        return null;
    }
}
