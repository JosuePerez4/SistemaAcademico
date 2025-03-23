package sistema.academico.entities;

import java.sql.Time;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Horario {
    private String diaSemana;
    private Time horaInicio;
    private Time horaFin;
    private String aula;
}