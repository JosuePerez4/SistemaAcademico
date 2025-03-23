package sistema.academico.services;

import java.sql.Time;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.academico.entities.Horario;
import sistema.academico.repository.HorarioRepository;

@Service
public class HorarioService {

    @Autowired
    private HorarioRepository horarioRepository;

    public String generarHorario() {
        Horario horario = new Horario();

        // Generar un día aleatorio
        String[] diasSemana = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
        int diaSemanaRandom = (int) (Math.random() * 7);
        horario.setDiaSemana(diasSemana[diaSemanaRandom]);

        // Generar una hora de inicio aleatoria (entre 7:00 AM y 7:00 PM)
        int horaInicioRandom = (int) (Math.random() * 12) + 7; // 7 AM a 7 PM
        int minutoInicioRandom = (int) (Math.random() * 4) * 15; // Minutos en múltiplos de 15 (0, 15, 30, 45)

        // Calcular la hora de fin (asumimos clases de 1 o 2 horas)
        int duracionClase = (Math.random() < 0.5) ? 1 : 2; // 50% de probabilidad de 1 o 2 horas
        int horaFin = horaInicioRandom + duracionClase;

        // Crear objetos Time
        Time horaInicio = Time.valueOf(String.format("%02d:%02d:00", horaInicioRandom, minutoInicioRandom));
        Time horaFinTime = Time.valueOf(String.format("%02d:%02d:00", horaFin, minutoInicioRandom));

        horario.setHoraInicio(horaInicio);
        horario.setHoraFin(horaFinTime);

        // Generar un aula aleatoria
        String[] aulas = { "A101", "B202", "C303", "D404", "E505" };
        int aulaRandom = (int) (Math.random() * aulas.length);
        horario.setAula(aulas[aulaRandom]);

        // Guardar en el repositorio
        horarioRepository.save(horario);

        // Retornar información generada
        return String.format("Horario generado: %s de %s a %s en aula %s",
                horario.getDiaSemana(), horario.getHoraInicio(), horario.getHoraFin(), horario.getAula());
    }

    // Validar si hay solapamiento con otro horario en la misma aula
    public boolean validarSolapamiento(Horario nuevoHorario) {
        List<Horario> horariosExistentes = horarioRepository.findByAula(nuevoHorario.getAula());

        for (Horario horario : horariosExistentes) {
            if (horario.getDiaSemana().equals(nuevoHorario.getDiaSemana())) {
                // Verifica si hay solapamiento en el mismo día
                if (nuevoHorario.getHoraInicio().before(horario.getHoraFin()) &&
                        nuevoHorario.getHoraFin().after(horario.getHoraInicio())) {
                    return true; // Hay solapamiento
                }
            }
        }
        return false; // No hay solapamiento
    }

    // Actualizar un horario existente
    public void actualizarHorario(String diaSemana, Time horaInicio, String aula,
            String nuevoDia, Time nuevaHoraInicio, Time nuevaHoraFin, String nuevaAula) {
        Optional<Horario> optionalHorario = horarioRepository.findByDiaSemanaAndHoraInicioAndAula(diaSemana, horaInicio,
                aula);

        if (optionalHorario.isPresent()) {
            Horario horario = optionalHorario.get();
            horario.setDiaSemana(nuevoDia);
            horario.setHoraInicio(nuevaHoraInicio);
            horario.setHoraFin(nuevaHoraFin);
            horario.setAula(nuevaAula);

            horarioRepository.save(horario);
        } else {
            throw new RuntimeException("Horario no encontrado para actualización.");
        }
    }

    // Obtener detalles del horario en formato de texto
    public String obtenerDetalles(Horario horario) {
        return String.format("Horario: %s | %s - %s | Aula: %s",
                horario.getDiaSemana(), horario.getHoraInicio(), horario.getHoraFin(), horario.getAula());
    }
}