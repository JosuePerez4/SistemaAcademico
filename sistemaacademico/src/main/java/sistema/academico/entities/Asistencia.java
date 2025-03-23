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
public class Asistencia {
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

