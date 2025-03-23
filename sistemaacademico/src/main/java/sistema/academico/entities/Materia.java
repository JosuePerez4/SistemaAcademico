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
public class Materia {
    private String nombre;
    private List<Materia> prerrequisitos;
    private String codigo;
    private String descripcion;
    private int creditos;
    private List<String> temario;
    private Curso curso;

    boolean agregarPrerrequisito(Materia materia) {
        return false;
    }

    boolean eliminarPrerrequisito(Materia materia) {
        return false;
    }

    List<Materia> obtenerPrerrequisitos() {
        return null;
    }

    List<String> obtenerTemas() {
        return null;
    }
}
