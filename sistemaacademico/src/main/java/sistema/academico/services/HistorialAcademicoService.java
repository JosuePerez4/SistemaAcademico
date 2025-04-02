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
        List<HistorialAcademico> historialPorEStudiante = null;
        return historialPorEStudiante;
    }

    // Agregar calificación al historial de un estudiante
    public void agregarCalificacion(Long historialId, Calificacion calificacion) {
    }

    // Listar calificaciones de un historial
    public List<Calificacion> listarCalificaciones(Long historialId) {
        List<Calificacion> calificaciones = null;
        return calificaciones;
    }
}
