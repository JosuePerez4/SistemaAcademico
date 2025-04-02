package sistema.academico.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Estado estado;
    private Estudiante estudiante;
    private Date fecha;

    public void registrarAsistencia() {
        // Lógica para registrar asistencia
    }

    public void generarReporteInasistencias() {
        // Lógica para generar un reporte de inasistencias
    }
}

