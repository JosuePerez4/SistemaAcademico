package sistema.academico;

import java.sql.Time;

public class Horario {
    private String diaSemana;
    private Time horaInicio;
    private Time horaFin;
    private String aula;

    public void generarHorario() {
        // Lógica para generar un horario
    }

    public boolean validarSolapamiento() {
        // Lógica para validar solapamiento de horarios
        return false;
    }

    public void actualizarHorario(String nuevoDia, Time nuevaHoraInicio, Time nuevaHoraFin, String nuevaAula) {
        // Lógica para actualizar un horario
    }

    public String obtenerDetalles() {
        // Lógica para obtener detalles del horario
        return diaSemana + " " + horaInicio + " - " + horaFin + " Aula: " + aula;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }
}

