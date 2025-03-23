package sistema.academico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.academico.entities.Calificacion;
import sistema.academico.entities.Estudiante;
import sistema.academico.entities.HistorialAcademico;
import sistema.academico.repository.HistorialAcademicoRepository;

@Service
public class HistorialAcademicoService {
    @Autowired
    private HistorialAcademicoRepository historialAcademicoRepository;

    public List<HistorialAcademico> obtenerHistorialPorEstudiante(Estudiante estudiante) {
        return historialAcademicoRepository.findByEstudiante(estudiante);
    }

    // Agregar calificación al historial de un estudiante
    public void agregarCalificacion(String historialId, Calificacion calificacion) {
        HistorialAcademico historial = historialAcademicoRepository.findById(historialId)
            .orElseThrow(() -> new RuntimeException("Historial académico no encontrado"));
        
        historial.getCalificaciones().add(calificacion);
        
        // Recalcular promedio y créditos acumulados
        recalcularPromedioYCreditos(historial);
        
        historialAcademicoRepository.save(historial);
    }

    // Listar calificaciones de un historial
    public List<Calificacion> listarCalificaciones(String historialId) {
        HistorialAcademico historial = historialAcademicoRepository.findById(historialId)
            .orElseThrow(() -> new RuntimeException("Historial académico no encontrado"));
        return historial.getCalificaciones();
    }

    // Método privado para recalcular el promedio y créditos
    private void recalcularPromedioYCreditos(HistorialAcademico historial) {
        if (historial.getCalificaciones().isEmpty()) {
            historial.setPromedioGeneral(0);
            historial.setCreditosAcumulados(0);
            return;
        }

        float totalNotas = 0;
        int totalCreditos = 0;

        for (Calificacion calificacion : historial.getCalificaciones()) {
            totalNotas += calificacion.getNota() * calificacion.getCurso().getMateria().getCreditos();
            totalCreditos += calificacion.getCurso().getMateria().getCreditos();
        }

        historial.setPromedioGeneral(totalNotas / totalCreditos);
        historial.setCreditosAcumulados(totalCreditos);
    }
}
