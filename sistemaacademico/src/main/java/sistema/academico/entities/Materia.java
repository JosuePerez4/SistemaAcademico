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
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
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
