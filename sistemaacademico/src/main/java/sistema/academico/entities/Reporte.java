package sistema.academico.entities;

import java.util.Date;

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
class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private String tipo;
    private Date fechaGeneracion;
    private String descripcion;
    private Usuario autor;

    public boolean generarReporte() {
        // Lógica para generar el reporte
        return true;
    }

    public void descargarReporte() {
        // Lógica para descargar el reporte
    }

    public boolean eliminarReporte() {
        // Lógica para eliminar el reporte
        return true;
    }

    public boolean modificarReporte(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
        return true;
    }
}
