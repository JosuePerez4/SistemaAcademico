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
public class Clase {
    private Date fecha;
    private Horario horario;
    private Asistencia asistencia;

    void anadirCurso() {
    }

    void cancelarClase() {
    }
}
