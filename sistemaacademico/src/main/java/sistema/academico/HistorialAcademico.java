package sistema.academico;

import java.util.List;

public class HistorialAcademico {
    Estudiante estudiante;
    List<Calificacion> calificaciones;
    List<Curso> cursosAprobados;
    List<Curso> cursosReprobados;
    float promedioGeneral;
    int creditosAcumulados;

    void agregarCalificacion(Calificacion calificacion) {
    }

    boolean cancelarMatricula() {
        return false;
    }

    List<Calificacion> listarCalificaciones() {
        return calificaciones;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public List<Curso> getCursosAprobados() {
        return cursosAprobados;
    }

    public void setCursosAprobados(List<Curso> cursosAprobados) {
        this.cursosAprobados = cursosAprobados;
    }

    public List<Curso> getCursosReprobados() {
        return cursosReprobados;
    }

    public void setCursosReprobados(List<Curso> cursosReprobados) {
        this.cursosReprobados = cursosReprobados;
    }

    public float getPromedioGeneral() {
        return promedioGeneral;
    }

    public void setPromedioGeneral(float promedioGeneral) {
        this.promedioGeneral = promedioGeneral;
    }

    public int getCreditosAcumulados() {
        return creditosAcumulados;
    }

    public void setCreditosAcumulados(int creditosAcumulados) {
        this.creditosAcumulados = creditosAcumulados;
    }
}
