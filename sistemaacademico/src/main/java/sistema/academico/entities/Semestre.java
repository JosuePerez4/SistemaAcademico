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
public class Semestre {
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private List<Materia> materias;

    List<Materia> listarMateriasSemestre() {
        return null;
    }

    boolean agregarMateria(Materia materia) {
        return false;
    }

    boolean eliminarMateria(Materia materia) {
        return false;
    }
}