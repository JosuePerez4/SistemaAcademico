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
public class Docente {
    private String especialidad;
    private int cargaHoraria;
    private String tituloProfesional;
    private String aniosExperiencia;
    private String tipoContrato;
    private Curso curso;

    public void registrarDocente() {
        // Lógica para registrar un docente
    }

    public void actualizarDocente() {
        // Lógica para actualizar un docente
    }

    public void eliminarDocente(Docente docente) {
        // Lógica para eliminar un docente
    }

    public void asignarCurso(Curso curso) {
        // Lógica para asignar un curso
    }

    public List<Curso> consultarCursos() {
        // Lógica para consultar los cursos asignados
        List<Curso> cursos = null;
        return cursos;
    }
}

