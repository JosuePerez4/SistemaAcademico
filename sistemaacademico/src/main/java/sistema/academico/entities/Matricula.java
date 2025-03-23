
package sistema.academico.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Matricula {
    private int id;
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
