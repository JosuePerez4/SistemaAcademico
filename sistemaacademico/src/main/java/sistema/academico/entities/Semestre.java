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
public class Semestre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
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